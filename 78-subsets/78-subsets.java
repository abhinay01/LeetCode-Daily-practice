class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList();
        ans.add(new ArrayList());
        
        for(int i:nums)
        {
            List<List<Integer>> out=new ArrayList();
            for(List<Integer> set:ans)
            {
                List<Integer> tmp=new ArrayList(set);
                tmp.add(i);
                out.add(tmp);
            }
            for(List<Integer> set:out)
            {
                ans.add(set);
            }
        }
        return ans;
    }
}