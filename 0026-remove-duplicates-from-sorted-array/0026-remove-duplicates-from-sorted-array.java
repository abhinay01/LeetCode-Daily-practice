class Solution {
    public int removeDuplicates(int[] nums) {
        int left=1,right=1,curr=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[right]==curr)
                right++;
            else
            {
                nums[left]=nums[right];
                curr=nums[right];
                right++;
                left++;
            }
                
        }
        return left;
    }
}