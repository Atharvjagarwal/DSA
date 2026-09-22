class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        
        ArrayList<Integer> minMax = new ArrayList<>();
        int min = 0;
        int max = 0;
        
        if(arr.length == 1){
            min = arr[0];
            max = arr[0];
        }
        else{
        
            if(arr[0]>arr[1]){
                min = arr[1];
                max = arr[0];
                }
            else{
                min = arr[0];
                max = arr[1];
            }    
            
            for (int i = 2; i<arr.length; i++){
                if(arr[i]> max){
                    max = arr[i];
                }
                else if (arr[i]< min){
                    min = arr[i];
                }
            }
        }
        
        minMax.add(min);
        minMax.add(max);
        return minMax;
        
    }
}
