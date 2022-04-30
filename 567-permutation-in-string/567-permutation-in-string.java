class Solution {
    public boolean checkInclusion(String s1, String s2) {
        s2=s2+s2;
        int h1[]=new int[26];
        // int h2[]=new int[26];
        int len1=s1.length();
        int len2=s2.length();
        for(int i=0;i<len1;i++)
        {
            h1[s1.charAt(i)-'a']++;
        }
        // for(int k=0;k<26;k++)
        //     System.out.print(h1[k]+" ");
        // System.out.println();
        for(int i=0;i<len2-len1;i++)
        {
            int h2[]=new int[26];
            // System.out.println(len1+" "+i+len1+" "+len2);
            for(int j=i;j<i+len1;j++)
            h2[s2.charAt(j)-'a']++;
            
            // for(int k=0;k<26;k++)
            //     System.out.print(h2[k]+" ");
            // System.out.println();
            
            int done=0;
            for(int k=0;k<26;k++)
            {
                // System.out.print("inside k loop"+ h1[k]+h2[k]);
                if(h1[k]!=h2[k])
                    break;
                else
                    done++;
            }
            // System.out.println();
            if(done==26)
                return true;
        }
        
        return false;
    }
}