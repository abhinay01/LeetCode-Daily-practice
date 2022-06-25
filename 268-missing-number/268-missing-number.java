class Solution {
    public int missingNumber(int[] nums) {
        int ans=0;
        int count=0;
        for(int i:nums)
        {
            ans=ans^(i^count);
            count++;
            // System.out.println(ans);
        }
        return ans^count;
    }
}