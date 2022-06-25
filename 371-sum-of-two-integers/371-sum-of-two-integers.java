class Solution {
    public int getSum(int a, int b) {
        int neg=0;
        if(a<0 && b<0){
            a=a*-1;
            b=b*-1;
            neg=1;
        }
        String A=Integer.toBinaryString(a);
        String B=Integer.toBinaryString(b);
        System.out.println(A+" "+B);
        int alen=A.length()-1;
        int blen=B.length()-1;
        int min=alen>blen?blen:alen;
        int max=alen<blen?blen:alen;
        int cin=0;
        String sum="";
        int left=max-min+1;
        min=min+1;
        
        while(min>0)
        {
            a=(int)(A.charAt(alen--)-'0');
            b=(int)(B.charAt(blen--)-'0');
            System.out.println(a);
            int add= a^b^cin;
            int carry=((a&b)|((cin&a)^(cin&b)));
            cin=carry;
            sum=(char)(add+'0')+sum;
            System.out.println(a+" b "+b+" add "+add+" carry "+carry+" sum "+sum);
            min--;
        }
        while(alen>=0)
        {
            a=(int)(A.charAt(alen--)-'0');
            b=0;
            System.out.println(a);
            int add= a^cin;
            int carry=cin&a;
            cin=carry;
            sum=(char)(add+'0')+sum;
            System.out.println(a+" b "+b+" add "+add+" carry "+carry+" sum "+sum+" alen"+alen);
        }
        while(blen>=0)
        {
            b=(int)(B.charAt(blen--)-'0');
            a=0;
            System.out.println(a);
            int add= b^cin;
            int carry=cin&b;
            cin=carry;
            sum=(char)(add+'0')+sum;
            System.out.println(a+" 1 b "+b+" add "+add+" carry "+carry+" sum "+sum+" blen"+blen);
        }
        if(cin==1)
            sum=(char)(cin+'0')+sum;
        System.out.println(sum);
        
        if(sum.length()>32)
        {
            sum=sum.substring(sum.length()-32);
            System.out.println(sum);
        }
        if(neg==1)
        {
            return -Integer.parseInt(sum,2);
        }
        return Integer.parseUnsignedInt(sum,2);
    }
}