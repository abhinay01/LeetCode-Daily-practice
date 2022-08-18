class Solution {
    public String multiply(String num1, String num2) {
        int n1=num1.length();
        int n2=num2.length();
        int prd[]=new int[n1+n2];
        for(int i=n1-1;i>=0;i--)
        {
            for(int j=n2-1;j>=0;j--)
            {
                int a=num1.charAt(i)-'0';
                int b=num2.charAt(j)-'0';
                prd[i+j+1]+=a*b;
                // System.out.println(prd[i+j+1]);
            }
        }
        int carry=0;
        String ans="";
        for(int i=prd.length-1;i>=0;i--)
        {
            int rem=(carry+prd[i])%10;
            carry=(carry+prd[i])/10;
            prd[i]=rem;
            ans=rem+ans;
        }
        int zero=0;
        for(int i=0;i<ans.length();i++)
        {
            // System.out.println(prd[i]);
            if(ans.charAt(i)=='0')
                zero++;
        }
        if(zero==ans.length())
            return "0";
        if(ans.charAt(0)=='0')
            return ans.substring(1);
        return ans;
    }
}