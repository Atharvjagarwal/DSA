class Solution {
    public void sort012(int[] arr) {
        // code here
        int low = 0;
        int mid = 0;
        int high = arr.length -1;
        
        while(mid <= high){
            
            switch(arr[mid]){
            
                case 0 -> {
                    int temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    
                    low++;
                    mid++;
                }
                    
                case 1 ->{
                    mid++;
                }
                case 2 ->{
                    int temp = arr[high];
                    arr[high] = arr[mid];
                    arr[mid] = temp;
                    
                    high--;
                }
            }        
        }
    }
}