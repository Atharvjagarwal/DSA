class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        
        HashMap<Character, Integer> freq = new HashMap<>();
        int low = 0;
        int maxL = Integer.MIN_VALUE;
        
        for(int high = 0; high<s.length(); high++){
            char R = s.charAt(high);
            
            freq.merge(R,  1, Integer::sum);
            
            if(freq.size() == k){
                maxL = Math.max(high - low + 1, maxL);
            }
            
            while(freq.size() > k){
                char L = s.charAt(low);
                freq.put(L, freq.get(L) - 1);
                
                if(freq.get(L) == 0){
                    freq.remove(L);
                }
                low++;
            }
        }if(maxL == Integer.MIN_VALUE){
            return -1;
        }else
            return maxL;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna