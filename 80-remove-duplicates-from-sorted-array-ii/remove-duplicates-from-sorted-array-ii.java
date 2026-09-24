class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;

        int count = 1;

        while(j<nums.length){
            if(nums[i]==nums[j] && count >= 2){
                j++;
            }
            else if(nums[i]==nums[j] && count < 2){
                i++;
                nums[i]=nums[j];
                j++;
                count++;
            }else{
                i++;
                nums[i]=nums[j];
                j++;
                count=1;
            }
        }
        return i+1;
    }
}