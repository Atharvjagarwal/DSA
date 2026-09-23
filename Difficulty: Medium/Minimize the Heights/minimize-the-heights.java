class Solution {
    public int getMinDiff(int[] arr, int k) {
        // code here
        if(arr.length==1)
            return 0;
            
        Arrays.sort(arr);
        
        int diff = arr[arr.length-1]-arr[0];
        
        int min;
        int max;
        
        for(int i = 1; i<arr.length; i++){
            if(arr[i]-k<0)
                continue;
                
            min = Math.min(arr[0]+k, arr[i]-k);
            max = Math.max(arr[i-1]+k, arr[arr.length-1]-k);
            
            diff = Math.min(diff,max-min);
        }
        return diff;
    }
}
