class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set=new HashSet();
        int len=nums.length;
        Arrays.sort(nums);
        int first=0;
        int last=len-1;
        for(int i=0;i<len;i++)
        {
            List<Integer> l=new ArrayList();
            first=i+1;
            while(last>first)
            {
                l=new ArrayList();
                int sum=nums[i]+nums[first]+nums[last];
                if(sum==0)
                {
                    l.add(nums[i]);
                    l.add(nums[first]);
                    l.add(nums[last]);
                    set.add(l);
                    first++;
                    last--;
                }
                else if(sum>0)
                    last--;
                else
                    first++;
            }
            last=len-1;
            
        }
        
        List<List<Integer>> ans=new ArrayList();
        for(List<Integer> r:set)
        {
            ans.add(r);
        }
        return ans;
    }
}