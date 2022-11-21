class Solution {
    public void sortColors(int[] nums) {
        int index=0;
        int twoindex=nums.length;
        for(int i:nums)
        {
            if(i==0)
                index++;
            else if(i==2)
                twoindex--;
        }
        // System.out.println(index);
        for(int i=0;i<nums.length;i++)
        {
            if(i<index)
            {
                nums[i]=0;
            }
            else if(i<twoindex)
                nums[i]=1;
            else
                nums[i]=2;
        }
    }
}