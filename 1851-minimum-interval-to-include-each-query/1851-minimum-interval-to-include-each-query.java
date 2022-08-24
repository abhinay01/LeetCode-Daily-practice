class Solution {
    public int[] minInterval(int[][] intervals, int[] queries) {
        TreeMap<Integer,Integer> pq=new TreeMap();
        HashMap<Integer,Integer> qu=new HashMap();
        int i=0;
        int il=intervals.length;
        int ql=queries.length;
        
        Arrays.sort(intervals,(x,y)->Integer.compare(x[0],y[0]));
        
        int [] q=queries.clone();
        Arrays.sort(q);
        int result[]=new int[ql];
        for(int k:q)
        {
            while(i<il && intervals[i][0]<=k)
            {
                int l=intervals[i][0];
                int r=intervals[i++][1];
                pq.put(r-l+1,r);
            }   
            while(!pq.isEmpty() && pq.firstEntry().getValue()<k)
                pq.pollFirstEntry();
            qu.put(k,pq.isEmpty()?-1:pq.firstKey());
        }
        i=0;
        for(int k:queries)
        {
            result[i++]=qu.get(k);
        }
        return result;
    }
}