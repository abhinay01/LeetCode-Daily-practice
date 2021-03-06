class Solution {
    public int findDuplicate(int[] nums) {
        int tortoise=nums[0];
        int hare=nums[0];
        do
        {
            hare=nums[nums[hare]];
            tortoise=nums[tortoise];
        }while(hare!=tortoise);
        
        tortoise=nums[0];
        
        while(hare!=tortoise)
        {
            tortoise=nums[tortoise];
            hare=nums[hare];
        }
        return hare;
    }
}