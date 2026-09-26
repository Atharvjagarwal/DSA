class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n = arr.length;
        
        int low = 0;
        int high = k-1;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        
        for(int i=0; i<=high; i++){
            sum += arr[i];
        }
            maxSum = sum;
        
        while(high<n){
            
            low++;
            high++;
            sum -= arr[low-1];
            
            if(high==n){
                break;
            }
            sum += arr[high];
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna