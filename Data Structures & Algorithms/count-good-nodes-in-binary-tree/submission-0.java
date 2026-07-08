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
    public int goodNodes(TreeNode root) {
        return dfs(root,root.val);
    }
    static int dfs(TreeNode root,int maxl)
    {
        if(root == null)
        {
            return  0;
        }
        int c =0;
        if(root.val>=maxl)
        {
            c=1;
        }
        maxl = Math.max(maxl,root.val);
        c +=dfs(root.left,maxl);
        c +=dfs(root.right,maxl);
        return c;
    }
}
