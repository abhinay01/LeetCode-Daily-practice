class Solution {
    public int uniquePaths(int m, int n) {
        int an=m+n-2;
        int c=Math.min(m-1,n-1);
        double ans=1;
        for(int i=1;i<=c;i++)
        {
            ans=ans*(an-c+i)/i;
        }
        // System.out.println(num/den);
        return (int) ans;
    }
}