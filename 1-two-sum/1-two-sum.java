class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
            m.put(nums[i],i);
        
        for(int i=0;i<nums.length;i++)
        {
            int remaining=target-nums[i];
            // System.out.println(remaining);
            if(m.containsKey(remaining))
            {
                // System.out.println(m.get(remaining));
                if(i!=m.get(remaining))
                return new int[]{i,m.get(remaining)};
            }
        }
        return new int[]{};
    }
}