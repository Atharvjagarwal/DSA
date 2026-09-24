class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> listoflists = new ArrayList<>();

        Arrays.sort(nums);

        for(int i=0; i<=n-2; i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int target = -1*nums[i];
            int left = i+1;
            int right = n-1;

            while(left<right){
                int sum = nums[left]+nums[right];

                if(sum == target){
                    List<Integer> list = new ArrayList<>();

                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    listoflists.add(list);

                    left++;
                    right--;

                    while(left<right && nums[left]==nums[left-1]){
                        left++;
                    }
                    while(right>left && nums[right]==nums[right+1]){
                        right--;
                    }
                }else if(sum<target){
                    left++;
                }else{
                    right--;
                }
            }
        }return listoflists;
    }
}