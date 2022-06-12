/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lca(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)
            return null;
        // System.out.println(root.val+" "+p.val+" "+q.val);
        if(root.val>=p.val && root.val<=q.val)
            return root;
        if(q.val<root.val)
            return lca(root.left,p,q);
        else
            return lca(root.right,p,q);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val>q.val)
            return lca(root,q,p);
           
        else
            return lca(root,p,q);
            
    }
}