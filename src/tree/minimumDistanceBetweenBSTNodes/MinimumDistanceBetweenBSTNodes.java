package tree.minimumDistanceBetweenBSTNodes;

public class MinimumDistanceBetweenBSTNodes {

    int min = Integer.MAX_VALUE;
    TreeNode prev = null;
    public int minDiffInBST(TreeNode root) {
        inOrder(root);
        return min;
    }

    private void inOrder(TreeNode root) {
        if(root == null) return;
        inOrder(root.left);
        if (prev != null) {
            min = Math.min(Math.abs(prev.val - root.val), min);
        }
        prev = root;
        inOrder(root.right);
    }
}
