class Solution {
    public double myPow(double x, int n) {
        double ans=1;
        long pow=n;
        if(pow<0)
            pow=-1*pow;
        while(pow>0)
        {
            if(pow%2==1)
            {
                ans=ans*x;
                pow=pow-1;
            }
            else
            {
                x=x*x;
                pow=pow/2;
            }
        }
        if(n<0)
            ans=1.0/ans;
        return ans;
    }
}