package tree.mergeTwoBinaryTrees;

public class MergeTwoBinaryTrees {

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return merge(root1, root2);
    }

    private TreeNode merge(TreeNode node1, TreeNode node2) {
        if (node1 == null) return node2;
        if (node2 == null) return node1;
        node1.val = node1.val + node2.val;
        node1.left = merge(node1.left, node2.left);
        node1.right = merge(node1.right, node2.right);
        return node1;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
