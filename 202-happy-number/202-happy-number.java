class Solution {
    public boolean isHappy(int n) {
        if(n<=0)
            return false;
        Set<Integer> set=new HashSet<Integer>();
        int s=n;
        while(n!=1 || s!=n)
        {
            
            int sum=0;
            while(n>0)
            {
                int r=n%10;
                sum+=r*r;
                n=n/10;
            }
            n=sum;
            // System.out.println("n "+n);
            // System.out.println(set);
            if(set.contains(n))
                return false;
            set.add(n);
            if(n==1)
                return true;
        }
        if(n==1)
                return true;
        else
            return false;
    }
}