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

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null)
        {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode cur = q.poll();
            if(cur == null)
            {
                sb.append("null,");
            }
            else
            {
                sb.append(cur.val).append(",");
                q.add(cur.left);
                q.add(cur.right);
            }
           
        }
         return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data == null  || data.length() == 0)
        {
            return null;
        }
        String[] v = data.split(",");
        if(v[0].equals("null"))
        {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(v[0]));
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int i=1;
        while(!q.isEmpty() && i<v.length)
        {
            TreeNode cur = q.poll();
              if(i<v.length && !v[i].equals("null"))
              {
                cur.left = new TreeNode(Integer.parseInt(v[i]));
                q.add(cur.left);
              }
              i++;
              if(i<v.length && !v[i].equals("null"))
              {
                cur.right = new TreeNode(Integer.parseInt(v[i]));
                q.add(cur.right);
              }
              i++;
        }
        return root;
    }
}
