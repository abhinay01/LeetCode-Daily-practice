class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums==null)
            return nums;
        int n=nums.length;
        if(n==0||k==0)
            return new int[0];
        Deque<Integer> q=new ArrayDeque<Integer>();
        int res[]=new int[n-k+1];
        int window=0;
        for(int i=0;i<n;i++)
        {
            while(!q.isEmpty() && nums[q.getLast()]<nums[i])
            {
                q.removeLast();
            }
            q.add(i);
            if(window>q.getFirst())
            {
                q.removeFirst();
            }
            if(i-window+1>=k)
            {
                res[window]=nums[q.getFirst()];
                window++;
            }
        }
        return res;
    }
}