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
    public boolean isSameTree(TreeNode a, TreeNode b) {
        if(a==null && b==null)
            return true;
        if((a!=null && b==null) || (a==null && b!=null))
            return false;
        // if(a.left!=null && a.left.val!=b.left.val)
        //     return false;
        // if(a.right.val!=b.right.val)
        //     return false;
        
            // return true;
        if(a.val==b.val)
        return isSameTree(a.left,b.left) && isSameTree(a.right,b.right);
        else return false;
        // return ;
    }
}