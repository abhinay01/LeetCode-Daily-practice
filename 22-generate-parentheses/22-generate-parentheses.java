class Solution {
   List<String> ans=new ArrayList<>();
        public List<String> generateParenthesis(int n) {
            
            parenthesis(n,n,"",ans);
            return ans;
        }
        // String curr="";
            public void parenthesis(int left,int right,String curr,List<String> ans) {   
                if(left==0 && right==0){
                    ans.add(curr);
                    return ;
                }            
                if(left!=0){
                    String op1=curr;
                    op1+="(";
                    parenthesis(left-1,right,op1,ans);
                }
                // curr= "("+parenthesis(left-1,right,ans);
                if(left<right){
                    String op1=curr;
                    op1+=")";
                    parenthesis(left,right-1,op1,ans);
                }
                
                return ;
            }
}