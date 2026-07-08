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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null)
        {
            return 0;
        }
        int l = h(root.left);
        int r = h(root.right);
        int d = l+r;
        int sub = Math.max(diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right));
        return Math.max(d,sub);
    }
    static int h(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }
        int l = h(root.left);
        int r = h(root.right);
        return 1 + Math.max(l,r);
    }
}
