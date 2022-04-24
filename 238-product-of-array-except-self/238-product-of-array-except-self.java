class Solution {
    public int[] productExceptSelf(int[] nums) {
        int sum=0;
        int zero=0;
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                if(sum==0)
                {
                    sum=nums[i];
                }
                else
                sum*=nums[i];
            }
            else
                zero++;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(zero>=2)
                ans[i]=0;
            else if(zero==1 && nums[i]!=0)
                ans[i]=0;
            else if(zero==1 && nums[i]==0)
                ans[i]=sum;
            else ans[i]=sum/nums[i];
        }
        return ans;
    }
}