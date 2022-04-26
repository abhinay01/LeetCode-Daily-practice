class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length<=2) 
            return new ArrayList<List<Integer>>();
        HashSet<List<Integer>> h=new HashSet();
        List<List<Integer>> ans=new ArrayList();
        Arrays.sort(nums);
        int first=0;
        int last=nums.length-1;
        for(int i=0;i<nums.length-1;i++)
        {
            first=i+1;
            last=nums.length-1;
            while(last>first)
            {
                List<Integer> l=new ArrayList();
                int sum=nums[i]+nums[first]+nums[last];
                // System.out.println(sum+" "+nums[i]+" "+nums[first]+" "+nums[last]);
                if(sum==0)
                {
                    l.add(nums[i]);
                    l.add(nums[first]);
                    l.add(nums[last]);
                    // if(!h.contains(l))
                        h.add(l);
                    last--;
                    first++;
                }
                else if(sum>0)
                {
                    last--;
                }
                else
                    first++;
            }
        }
        // System.out.println(h);
        for(List<Integer> l:h)
        {
            ans.add(l);
        }
        return ans;
    }
}