class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> count=new HashMap();
        for(char c:t.toCharArray())
        {
            count.put(c,count.getOrDefault(c,0)+1);
        }
        // System.out.println(count);
        int start=0;
        int match=0;
        int startIndex=0;
        int minLength=s.length()+1;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            // System.out.println(c);
            if(count.containsKey(c))
            {
                count.put(c,count.get(c)-1);
                if(count.get(c)==0) 
                    match++;
            }
            while(match==count.size())
            {
                if(minLength>i-start+1)
                {
                    // System.out.println(minLength);
                    minLength=i-start+1;
                    startIndex=start;
                }
                char delete=s.charAt(start);
                start++;
                if(count.containsKey(delete))
                {
                    if(count.get(delete)==0) 
                    match--;
                    count.put(delete,count.get(delete)+1);
                }
            }
        }
        return minLength > s.length()? "" : s.substring(startIndex,startIndex+minLength);
    }
}