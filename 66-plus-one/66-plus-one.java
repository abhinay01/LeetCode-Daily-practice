class Solution {
    public int[] plusOne(int[] digits) {
        int len=digits.length;
        
        if((digits[len-1]+1)<10)
        {
            digits[len-1]=digits[len-1]+1;
            return digits;
        }
        else
        {
            int carry=0;
            int sum=digits[len-1]+1;
            for(int i=len-1;i>=0;i--)
            {
                if(i!=len-1)
                sum=digits[i]+carry;
                carry=sum/10;
                sum=sum%10;
                digits[i]=sum;
            }
            if(carry==1)
            {
                int [] l=new int[len+1];
                l[0]=carry;
              for(int i=1;i<=len;i++)
                {  
                    l[i]=digits[i-1];
                }
                return l;
        }
            return digits;
    }
}
}