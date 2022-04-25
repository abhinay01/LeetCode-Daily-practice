class Solution {
    public int longestConsecutive(int[] nums) {
        // int hash[]=new int[2000000001];
        // Arrays.fill(hash,0);
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        // for(int i=0;i<nums.length;i++)
        // {
        //     hash[nums[i]]++;
        // }
        int max=1;
        int maxf=0;
        // int chain=false;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1]+1)
            {
                // if(chain==false)
                // {
                    max++;
                // }
                // else
                    
            }
            else if(nums[i]==nums[i-1])
            {
                // if(max==0)
                //     max=1;
            }
            else
            {
                if(max>maxf)
                    maxf=max;
                // chain=false;
                max=1;
            }
        }
        if(max>maxf)
                    maxf=max;
        return maxf;
    }
}