package tree.searchInBinarySearchTree;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 06/16/2020 10:36 AM
 */
public class SearchinaBinarySearchTree {

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        TreeNode cur = root;
        while (cur != null) {
            if (cur.val == val) return cur;
            else if (cur.val > val) cur = cur.left;
            else cur = cur.right;
        }
        return null;
    }

    public TreeNode searchBST_recursion(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) return root;
        else if (root.val > val) return searchBST_recursion(root.left, val);
        else return searchBST_recursion(root.right, val);
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
