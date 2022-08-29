class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> h=new HashMap();
        for(int i=0;i<nums.length;i++)
        {
         h.put(nums[i],i);   
        }
        for(int i=0;i<nums.length;i++)
        {
            int sum=target-nums[i];
            if(h.containsKey(sum) && h.get(sum)!=i)
            {
                return new int [] {i,h.get(sum)};
            }
        }
        return new int[2];
    }
}