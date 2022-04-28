class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,right=0,longest=0;
        int len=s.length();
        HashSet<Character> h=new HashSet();
        while(right<len)
        {
            if(!h.contains(s.charAt(right)))
            {
                h.add(s.charAt(right));
                right++;
            }
            else
            {
                h.remove(s.charAt(left));
                left++;
            }
            longest=Math.max(longest,right-left);
        }
        return longest;
    }
}