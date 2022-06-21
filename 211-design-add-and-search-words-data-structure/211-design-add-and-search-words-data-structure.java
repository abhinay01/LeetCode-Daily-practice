class WordDictionary {
    
    private class Trie{
        Map<Character,Trie> charMap;
        boolean ew;
        
        Trie(){
            charMap=new HashMap();
            ew=false;
        }
    }

    Trie root;
    public WordDictionary() {
        root=new Trie();
    }
    
    public void addWord(String word) {
        Trie current=root;
        for(int i=0;i<word.length();i++)
        {
            char c=word.charAt(i);
            Trie node=current.charMap.get(c);
            if(node==null)
            {
                node = new Trie();
                current.charMap.put(c,node);
            }
            current=node;
        }
        current.ew=true;
    }
    Trie current=root;
    public boolean search(String word) {
        return searchword(word,root);
    }
    
    public boolean searchword(String word,Trie current) {
        // current=current;
        // System.out.println("r");
        // if(word.length()<=0)
        //     return false;
        for(int i=0;i<word.length();i++)
        {
            char c=word.charAt(i);
            // System.out.println("c "+c);
            if(c=='.')
            {
                for(Map.Entry<Character, Trie> entry : current.charMap.entrySet())
                {
                    
                    Trie ch = entry.getValue();
                    // System.out.println("ch "+ch);
                    // System.out.println(ch.charMap);
                    if((ch!=null && searchword(word.substring(i+1),ch)))
                    {
                        return true;
                    }
                        
                }
                return false;
            }
            else
            {
                // System.out.println("else "+c);
            Trie node=current.charMap.get(c);
            if(node==null){
                return false;
            }
            current =node;
            }
        }
        // System.out.println("current "+current.ew);
        return current.ew && current != null;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */