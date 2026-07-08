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
    int p=0;
    HashMap<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++)
        {
            map.put(inorder[i],i);
        }
        return b(preorder,0,preorder.length-1);
    }
    public TreeNode b(int[] pr,int l,int r)
    {
        if(l>r)
        {
            return null;
        }
        int v = pr[p++];
        TreeNode root = new TreeNode(v);
        int mid =map.get(v);
        root.left = b(pr,l,mid-1);
        root.right = b(pr,mid+1,r);

        return root;

    }
}
