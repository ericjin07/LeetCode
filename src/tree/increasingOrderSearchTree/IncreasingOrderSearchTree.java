package tree.increasingOrderSearchTree;

public class IncreasingOrderSearchTree {

    TreeNode cur;
    public TreeNode increasingBST(TreeNode root) {
        TreeNode dummy = new TreeNode(-1);
        cur = dummy;
        inOrder(root);
        return dummy.right;
    }

    private void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);

        cur.right = root;
        root.left = null;
        cur = root;

        inOrder(root.right);
    }
}
