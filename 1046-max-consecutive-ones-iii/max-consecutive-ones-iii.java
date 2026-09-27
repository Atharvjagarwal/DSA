class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        
        int left = 0;
        int maxL = 0;
        int zero = 0;
        
        for(int right = 0; right<n; right++){
            if(nums[right] == 0){
                zero++;
            }

            int windowL = right-left+1;

            while(zero>k){
                if(nums[left] == 0){
                    zero--;
                }
                left++;
            }

            windowL = right-left+1;

            maxL = Math.max(maxL, windowL);
        }
        return maxL;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna