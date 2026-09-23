class Solution {
    public void rotate(int[] arr) {
        // code here
        int lastdigit = arr[arr.length-1];
        
        for(int i=arr.length-1; i>0; i--){
            arr[i]= arr[i-1];
        }
        
        arr[0]=lastdigit;
    }
}