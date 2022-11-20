class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> tri=new ArrayList();
        List<Integer> f=new ArrayList();
        f.add(1);
        tri.add(f);
        if(numRows==1)
            return tri;
        List<Integer> f2=new ArrayList();
        f2.add(1);
        f2.add(1);
        tri.add(f2);
         if(numRows==2)
            return tri;
        int r=3;
        int col=0;
        
        while(r<=numRows)
        {
            // while(col<=r)
            List<Integer> l=new ArrayList();
            for(col=0;col<r;col++){
            
            if(col==0||col==r-1)
                l.add(1);
            else
            {
                List<Integer> t = tri.get(tri.size() - 1);
                // System.out.println(tri.size());
                int n=t.get(col)+t.get(col-1);
                l.add(n);
            }
            }
            tri.add(l);
            r++;
        }
        return tri;
    }
}