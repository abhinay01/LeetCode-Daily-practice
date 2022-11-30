class Solution {
    public int trap(int[] height) {
        int [] lfmax=new int[height.length];
        int [] rtmax=new int[height.length];
        int k=height.length;
        int lmax=height[0];
        int rmax=height[k-1];
        for(int i=0;i<k;i++)
        {
            if(lmax<height[i])
                lmax=height[i];
                lfmax[i]=lmax;
        }
        for(int i=k-1;i>=0;i--)
        {
            if(rmax<height[i])
                rmax=height[i];
                rtmax[i]=rmax;
        }
        // for(int i=0;i<k;i++)
        // {
        //     System.out.print(lfmax[i]);
        // }
        // System.out.println();
        // for(int i=0;i<k;i++)
        // {
        //     System.out.print(rtmax[i]);
        // }
        int ans=0;
        for(int i=0;i<k;i++)
        {
            ans+=Math.min(lfmax[i],rtmax[i])-height[i];
        }
        return ans;
    }
}