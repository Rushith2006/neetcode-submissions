

public class Codec {

    // Serialize (Tree -> String)
    public String serialize(TreeNode root) {

        if (root == null) return "";

        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {

            TreeNode curr = q.poll();

            if (curr == null) {
                sb.append("null,");
            } else {
                sb.append(curr.val).append(",");
                q.offer(curr.left);
                q.offer(curr.right);
            }
        }

        return sb.toString();
    }

    // Deserialize (String -> Tree)
    public TreeNode deserialize(String data) {

        if (data == null || data.length() == 0)
            return null;

        String[] values = data.split(",");

        if (values[0].equals("null"))
            return null;

        TreeNode root = new TreeNode(Integer.parseInt(values[0]));

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int i = 1;

        while (!q.isEmpty() && i < values.length) {

            TreeNode curr = q.poll();

            if (i < values.length && !values[i].equals("null")) {
                curr.left = new TreeNode(Integer.parseInt(values[i]));
                q.offer(curr.left);
            }
            i++;

            if (i < values.length && !values[i].equals("null")) {
                curr.right = new TreeNode(Integer.parseInt(values[i]));
                q.offer(curr.right);
            }
            i++;
        }

        return root;
    }
}