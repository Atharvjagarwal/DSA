class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int n = fruits.length;
        int low = 0;
        int cap = 0;
        int maxF = 0;

        for(int high = 0; high<n; high++){
            freq.merge(fruits[high], 1, Integer::sum);

            if(freq.size()>2){
                freq.put(fruits[low], freq.get(fruits[low])-1);

                if(freq.get(fruits[low]) == 0){
                    freq.remove(fruits[low]);
                }

                low++;
            }

            cap = high-low+1;
            maxF = Math.max(maxF, cap);
        }return maxF;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna