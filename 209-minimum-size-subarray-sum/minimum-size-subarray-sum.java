class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0; 
        int sum = 0;
        int minL = Integer.MAX_VALUE;
        int right = 0;

        while(right<n){
            sum += nums[right];

            while(sum>=target){
                minL = Math.min(minL, right-left+1);
                sum -= nums[left];
                left++;
            }
            right++;
        } 
        
        if(minL == Integer.MAX_VALUE){
            return 0;
        }else{
            return minL;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna