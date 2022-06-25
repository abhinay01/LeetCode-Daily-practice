public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int sum=0;
        // System.out.println(n);
        for(int i=0;i<32;i++)
        {
          int digit=n&1;  
            sum=sum*2+digit;
            n=n>>>1;
        }
        return sum;
    }
}