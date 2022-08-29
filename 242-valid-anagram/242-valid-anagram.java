class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        char [] c=s.toCharArray();
        char [] check=t.toCharArray();
        int [] cb= new int[26];
        // int [] checkb = new int[s.size()];
        for(int i=0;i<c.length;i++)
        {
            cb[c[i]-'a']++;
        }
        for(int i=0;i<c.length;i++)
        {
            cb[check[i]-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(cb[i]!=0)
                return false;
        }
        return true;
    }
}