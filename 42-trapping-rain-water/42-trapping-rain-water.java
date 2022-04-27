class Solution {
    public int trap(int[] height) {
        int len=height.length;
        int front[]=new int[len];
        int back[]=new int[len];
        int maxLeft=0;
        // int minRight=0;
        
        for(int i=0;i<len;i++)
        {
            if(height[i]>maxLeft)
            {
                maxLeft=height[i];
                front[i]=height[i];
            }
            else
                front[i]=maxLeft;
        }
        int minRight=height[len-1];
        for(int i=len-1;i>=0;i--)
        {
            if(height[i]>minRight)
            {
                minRight=height[i];
                back[i]=height[i];
            }
            else
                back[i]=minRight;
        }
        int ans=0;
//         for(int i=0;i<len;i++)
//         {
//             System.out.print(front[i]+" ");
            
//         }
//         System.out.println();
//         for(int i=0;i<len;i++)
//         {
//             System.out.print(back[i]+" ");
            
//         }
        for(int i=0;i<len;i++)
        {
            ans+=Math.min(front[i],back[i])-height[i];
        }
        return ans;
    }
}