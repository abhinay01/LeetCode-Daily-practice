class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> l=new HashSet();
        for(int num:nums)
            l.add(num);
        int max=0;
        for(int num:nums)
        {
            if(!l.contains(num-1))
            {
                int c=1;
                int n=num;
                while(l.contains(n+1))
                {
                    n=n+1;
                   c++; 
                }
                if(c>max)
                    max=c;
            }
        }
        return max;
    }
}