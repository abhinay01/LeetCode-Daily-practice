class Solution {
    public int characterReplacement(String s, int k) {
        int windowStart=0,longest=0;
        Map<Character,Integer> characterCount=new HashMap();
        for(int windowEnd=0;windowEnd<s.length();windowEnd++)
        {
            char c=s.charAt(windowEnd);
            characterCount.put(c,(characterCount.getOrDefault(c, 0) + 1));
            
            while((windowEnd-windowStart+1)-Collections.max(characterCount.values())>k){
                char toRemove=s.charAt(windowStart);
                characterCount.put(toRemove,characterCount.get(toRemove)-1);
                windowStart++;
            }
            longest=Math.max(longest,windowEnd-windowStart+1);
        }
        return longest;
    }
}