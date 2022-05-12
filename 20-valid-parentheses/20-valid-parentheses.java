class Solution {
    public boolean isValid(String s) {
     Stack<Character> st=new Stack<Character>();
        Map<Character,Character> ch=new HashMap<>();
        ch.put(')','(');
        ch.put('}','{');
        ch.put(']','[');
        for(char c:s.toCharArray())
        {
            if(ch.containsKey(c))
            {
                if(!st.isEmpty() && st.peek()==ch.get(c))
                    st.pop();
                else
                    return false;
            }
            else
            {
                st.push(c);
            }
        }
        return st.isEmpty();
    }
}