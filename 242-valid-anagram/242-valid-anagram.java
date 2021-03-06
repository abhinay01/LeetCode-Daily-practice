class Solution {
    public boolean isAnagram(String s, String t) {
        int count1[]=new int[26];
        int count2[]=new int[26];
        Arrays.fill(count1,0);
        Arrays.fill(count2,0);
        for(int i=0;i<s.length();i++)
        {
            count1[(s.charAt(i)-'a')%26]++;
        }
        for(int i=0;i<t.length();i++)
        {
            count2[(t.charAt(i)-'a')%26]++;
        }
        for(int i=0;i<26;i++)
        {
            if(count1[i]!=count2[i])
                return false;
        }
        return true;
    }
}