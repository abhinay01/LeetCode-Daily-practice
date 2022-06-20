class Trie {
    
    
    private class TrieNode{
        Map<Character,TrieNode> children;
        boolean endofword;
        TrieNode(){
            children= new HashMap<>();
            endofword=false;
        }
        
    }
    TrieNode root;
    public Trie() {
      root=new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode current=root;
        for(int i=0;i<word.length();i++)
        {
            char c=word.charAt(i);
            TrieNode node=current.children.get(c);
            if(node==null){
                node =new TrieNode();
            current.children.put(c,node);
            }
            current =node;
        }
        current.endofword=true;
    }
    
    public boolean search(String word) {
        TrieNode current=root;
        for(int i=0;i<word.length();i++)
        {
            char c=word.charAt(i);
            TrieNode node=current.children.get(c);
            if(node==null){
                return false;
            }
            current =node;
        }
        return current.endofword;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode current=root;
        for(int i=0;i<prefix.length();i++)
        {
            char c=prefix.charAt(i);
            TrieNode node=current.children.get(c);
            if(node==null){
                return false;
            }
            current =node;
        }
        return true;
    }
}
/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */