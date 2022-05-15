class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> st=new Stack<>();
        int [] res=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++)
        {
            while(!st.isEmpty() && st.peek()[0]<temperatures[i])
            {
                int [] temp=st.pop();
                res[temp[1]]=i-temp[1];
            }
            st.push(new int[]{temperatures[i], i});
        }
        return res;
    }
}