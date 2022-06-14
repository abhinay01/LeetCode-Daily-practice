/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val; *     TreeNode left; *     TreeNode right; *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    HashMap<Integer,Integer> inordermap=null;
    int index;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        index=0; 
        inordermap=new HashMap();
        for(int i=0;i<inorder.length;i++)
        {
            inordermap.put(inorder[i],i);
        }
        return buildTreeUtil(preorder,0,preorder.length-1);
    }
    public TreeNode buildTreeUtil(int[] preorder, int start,int end) {
        if(start>end)
            return null;
        int rootval=preorder[index++];
        TreeNode root=new TreeNode(rootval);
        root.left=buildTreeUtil(preorder,start,inordermap.get(rootval)-1);
        root.right=buildTreeUtil(preorder,inordermap.get(rootval)+1,end);
        return root;
    }
}