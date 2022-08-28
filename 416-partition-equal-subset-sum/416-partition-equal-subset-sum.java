class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++)
            sum+=nums[i];
        
        if(sum%2!=0)
            return false;
        boolean [][] dp=new boolean[sum+1][n+1];
        sum=sum/2;
        for(int i=0;i<=sum;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(j==0)
                    dp[i][j]=false;
                if(i==0)
                    dp[i][j]=true;
                if(i!=0 && j!=0 )
                {
                    if(i>=nums[j-1])
                    dp[i][j]=dp[i-nums[j-1]][j-1] || dp[i][j-1];
                    else
                        dp[i][j]=dp[i][j-1];
                }
            }
        }
        return dp[sum][n];
    }
}