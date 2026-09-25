class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hash = new HashMap<>();
        int n = nums.length;

        for(int i = 0; i<n; i++){
            hash.put(nums[i], i);
        }

        for(int i = 0; i<n; i++){
            int value = target - nums[i];
            if(hash.containsKey(value) && hash.get(value) != i){
                return new int[]{i,hash.get(value)};
            }
        }

        return new int[]{};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna