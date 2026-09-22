class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        PriorityQueue<Integer> pg = new PriorityQueue<>();
        
        for(int i=0; i<arr.length; i++){
            pg.add(arr[i]);
        }
        int i=0;
        while(i<k-1){
            pg.poll();
            i++;
        }
        
        return pg.poll();
    }
}
