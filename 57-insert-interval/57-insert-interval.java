class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> l= new ArrayList();
        for(int [] intr:intervals)
        {
            if(newInterval==null || newInterval[0]>intr[1])
                l.add(intr);
            else if(newInterval[1]<intr[0])
            {
                l.add(newInterval);
                l.add(intr);
                newInterval=null;
            }
            else
            {
             newInterval[0]=Math.min(newInterval[0],intr[0]);
                newInterval[1]=Math.max(newInterval[1],intr[1]);
            }
        }
        if(newInterval!=null)
            l.add(newInterval);
        return l.toArray(new int[l.size()][]);
    }
}