/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null)
            return new ArrayList();
        List<Integer> ans=new ArrayList();
        List<List<Integer>> tree=levelOrder(root);
        for(List<Integer> l:tree)
        {
            int len=l.size();
            ans.add(l.get(len-1));
        }
        return ans;
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null)
            return new ArrayList();
        List<List<Integer>> ans=new ArrayList();
        Queue<TreeNode> q=new LinkedList();
        q.add(root);
        q.add(null);
        List<Integer> l=new ArrayList();
        while(q.size()>1)
        {
            TreeNode a=q.peek();
            if(a==null)
            {
                q.remove();
                ans.add(l);
                l=new ArrayList();
                q.add(null);
            }
            else{
            if(a.left!=null)
                q.add(a.left);
            if(a.right!=null)
                q.add(a.right);
            l.add(a.val);
            q.remove();
            }
        }
        ans.add(l);
        return ans;
    }
}