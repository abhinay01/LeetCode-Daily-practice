class Solution {
    public boolean isPalindrome(String s) {
        int in=0;
        s=s.toLowerCase();
        int j=s.length()-1;
        while(in<=j)
        {
            char front=s.charAt(in);
            char back=s.charAt(j);
            // System.out.println(front+" "+back);
            if(!Character.isLetterOrDigit(front))
            {
                in++;
                continue;
            }
            if(!Character.isLetterOrDigit(back))
            {
                j--;
                continue;
            }
            if(front!=back)
            {
                return false;
            }
            in++;
            j--;
        }
        return true;
    }
}