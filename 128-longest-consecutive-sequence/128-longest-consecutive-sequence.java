class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> h=new HashSet();
        for(int num:nums)
        {
            h.add(num);
        }
        int maxStreak=0;
        for(int num:nums)
        {
            if(!h.contains(num-1))
            {
                int currentNum=num;
                int currentStreak=1;
                
                while(h.contains(currentNum+1))
                {
                    currentNum=currentNum+1;
                    currentStreak++;
                }
                
                if(currentStreak>maxStreak)
                    maxStreak=currentStreak;
            }
        }
        return maxStreak;
    }
}