class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1)
            return intervals;
        
        Arrays.sort(intervals,(i,j)->Integer.compare(i[0],j[0]));
        
       List<int[]> l=new ArrayList();
        l.add(intervals[0]);
        int [] newinterval=l.get(0);
        for(int [] interval: intervals)
        {
            if(interval[0]<=newinterval[1])
                newinterval[1]=Math.max(newinterval[1],interval[1]);
            else
            {
                newinterval=interval;
                l.add(interval);
            }
        }
        return l.toArray(new int[l.size()][]);
    }
}