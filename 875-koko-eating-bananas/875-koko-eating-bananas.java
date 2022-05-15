class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=1;
        for(int pile:piles)
        {
            right=Math.max(right,pile);
        }
        while(left<right)
        {
            int mid=(right+left)/2;
            int timetaken=0;
            
            for(int pile:piles)
            {
                timetaken+=Math.ceil((double)pile/mid);
            }
            if(timetaken>h)
            {
                left=mid+1;
            }
            else
                right=mid;
        }
        return left;
    }
}