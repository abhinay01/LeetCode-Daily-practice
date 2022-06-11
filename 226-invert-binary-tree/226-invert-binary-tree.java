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
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
            return root;
        if(root.left==null)
        {
            root.left=root.right;
            root.right=null;
        }
        else if(root.right==null)
        {
            root.right=root.left;
            root.left=null;
        }
        else if(root.left!=null && root.left!=null)
        {
            TreeNode tmp=root.left;
            root.left=root.right;
            root.right=tmp;
        }
        
        if(root.left!=null)
         invertTree(root.left);
        if(root.right!=null)
        invertTree(root.right);
        return root;
    }
}