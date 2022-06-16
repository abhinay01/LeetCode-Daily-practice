class KthLargest {
    PriorityQueue<Integer> pq;
    int k;
    // List<Integer
    public KthLargest(int j, int[] nums) {
        pq=new PriorityQueue<Integer>();
        k=j;
        for(int i=0;i<nums.length;i++)
            pq.add(nums[i]);
        
        while (pq.size()>k) {
            pq.remove();
        }
    }
    
    public int add(int val) {
        // System.out.println("pq "+pq);
        pq.add(val);
        // System.out.println("pq "+pq);
        while (pq.size()>k) {
            pq.remove();
        }
        return pq.peek();
    }
}
/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */