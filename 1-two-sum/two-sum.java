class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        for(int i = 0; i<n; i++){
           for(int j = i+1; j<n; j++){
            int sum = nums[i]+nums[j];
                if(sum==target){
                    return new int[]{i,j};
                }
           }
        }

        return new int[]{};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna