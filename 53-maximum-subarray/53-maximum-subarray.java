class Solution {
   public int maxSubArray(int[] nums) {
        int ls=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            if(ls<sum)
            {
                ls=sum;
            }
            if(sum<0)
                sum=0;
                // System.out.println(ls);
        }
        return ls;
    }
}