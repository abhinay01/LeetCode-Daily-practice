class Solution {
    public int reverse(int x) {
        int flag=0;
        if(x<0)
        {
         flag=1;
            x=-x;
        }
        int s=0;
        while(x>0)
        {
            
            int r=x%10;
            if(s>Integer.MAX_VALUE/10)
                return 0;
            else
              s=s*10+r;
            x=x/10;
        }
        if(flag==1)
            return -s;
        else
        return s;
    }
}