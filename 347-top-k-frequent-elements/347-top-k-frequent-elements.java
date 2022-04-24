class Solution {
    public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<Integer, Integer> > list =
               new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet());
 
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
            public int compare(Map.Entry<Integer, Integer> o2,Map.Entry<Integer, Integer> o1)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
         
       // put data from sorted list to hashmap
		HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
		for (Map.Entry<Integer, Integer> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}
		return temp;
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> count=new HashMap<>();
        for(int i:nums)
        {
            if(count.get(i) == null)
            {
                count.put(i,0);
            }
            else
            {
                int c=count.get(i);
                count.put(i,c+1);
            }
        }
        HashMap<Integer,Integer> tcount=new HashMap();
          tcount=  sortByValue(count);
        System.out.println(tcount);
         // System.out.println(temp);
        int [] ans=new int[k];
        // for(int i=0;i<k;i++)
        // {
        //     ans[i]=
        // }
        int i=0;
        for(Map.Entry<Integer,Integer> entry:tcount.entrySet())
        {
            if(i<k)
            {
                ans[i++]=entry.getKey();
            }
        }
        return ans;
    }
}