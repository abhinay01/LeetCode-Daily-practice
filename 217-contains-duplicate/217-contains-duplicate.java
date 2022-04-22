class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> h=new LinkedHashSet<Integer>();
        for(int i:nums)
        {
            if(!h.contains(i))
            {
                h.add(i);
                
            }
            else
                return true;
        }
        return false;
    }
}