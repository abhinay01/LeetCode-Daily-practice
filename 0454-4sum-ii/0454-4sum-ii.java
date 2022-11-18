class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int n=nums1.length;
        Map<Integer,Integer> m1=new HashMap();
        Map<Integer,Integer> m2=new HashMap();
        for(int i=0;i<n;i++)
        {
            // int t1=nums1[i];
            for(int j=0;j<n;j++)
            {
                int s=nums1[i]+nums2[j];
                int count=m1.getOrDefault(s,0);
                m1.put(s,count+1);
            }
        }
        int c2=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int s=nums3[i]+nums4[j];
                int count=m2.getOrDefault(s,0);
                m2.put(s,count+1);
            }
        }
        int ans=0;
        for(Map.Entry<Integer,Integer> entry:m1.entrySet())
        {
            int k=entry.getKey();
            int v=entry.getValue();
            
            int v1=m2.getOrDefault(k*-1,0);
            ans+=v*v1;
        }
        return ans;
    }
}