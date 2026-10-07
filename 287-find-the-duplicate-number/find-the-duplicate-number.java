class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int i= 0; i<nums.length; i++){
            freq.merge(nums[i] , 1, Integer::sum);
            if(freq.get(nums[i])>1){
                return nums[i];
            }
        }return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna