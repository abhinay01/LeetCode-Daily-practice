class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<int[]> st=new Stack<>();
        int maxArea=0;
        for(int i=0;i<heights.length;i++)
        {
            int start=i;
            while(!st.isEmpty() && st.peek()[1]>heights[i])
            {
                int [] current=st.pop();
                int index=current[0];
                int height=current[1];
                maxArea=Math.max(maxArea,height*(i-index));
                start=index;
            }
            st.push(new int[]{start,heights[i]});
        }
        while(!st.isEmpty())
        {
            int [] current=st.pop();
                int index=current[0];
                int height=current[1];
                maxArea=Math.max(maxArea,height*(heights.length-index));
        }
        return maxArea;
    }
}