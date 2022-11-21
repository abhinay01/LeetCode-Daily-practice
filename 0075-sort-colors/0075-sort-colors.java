class Solution {
    public void sortColors(int[] nums) {
        int low=0,mid=0;
        int high=nums.length-1;
        // int i=0;
        while(mid<=high)
        {
            if(nums[mid]==0)
            {
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                mid++;
                low++;
            }
            else if(nums[mid]==1)
            {
                mid++;
            }
            else
            {
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
    }
}