
class Solution {

    public static int kthSmallest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k-1];
    }
    
    public static int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++) pq.add(arr[i]);
        int i=1;
        while(!pq.isEmpty() && i<k){
            pq.poll();
            i++;
        }
        return pq.peek();
    }
    
}
