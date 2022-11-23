class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int index=-1;
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i+1]>nums[i])
            {
                index=i;
                break;
            }
        }
        for(int i=n-2;i>=index;i--)
        {
            if(index!=-1 && nums[i+1]>nums[index])
            {
                swap(nums,i+1,index);
                break;
            }
            // else
            //     index=
        }
        reverse(nums,index+1);
    }
    private void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
     private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}