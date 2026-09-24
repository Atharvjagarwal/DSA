class Solution {
    int countTriplets(int sum, int arr[]) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        
        int count = 0;
        
        for(int i = 0; i<n-2; i++){
            
            int left = i+1;
            int right = n-1;
            
            while (left<right){
                
                int sumless = arr[i]+arr[left]+arr[right];
                
                if(sumless<sum){
                
                    count += right-left;
                    
                }if(sumless<sum){
                    left++;
                }else{
                    right--;
                }
                
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna