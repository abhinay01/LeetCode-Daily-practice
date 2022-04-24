class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0) return new ArrayList<List<String>>();
        List<List<String>> result=new ArrayList<List<String>>();
        Map<String,List<String>> map=new HashMap();
        for(String s:strs)
        {
            char hash[]=new char[26];
            for(char c:s.toCharArray())
            {
                hash[c-'a']++;
            }
            String k=new String(hash);
            if(map.get(k)==null)
            {
                map.put(k,new ArrayList<String>());
            }
                map.get(k).add(s);
        }
        result.addAll(map.values());
        return result;
    }
}