package tree.constructBSTfromPreorderTraversal;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 05/25/2020 3:19 PM
 */
public class ConstructBSTfromPreorderTraversal {

    int i = 0;

    public TreeNode bstFromPreorder(int[] preorder) {
        return bstFromPreorder(preorder, Integer.MAX_VALUE);
    }

    private TreeNode bstFromPreorder(int[] preorder, int bound) {
        if (i == preorder.length || preorder[i] > bound) return null;
        TreeNode parent = new TreeNode(preorder[i++]);
        parent.left = bstFromPreorder(preorder, parent.val);
        parent.right = bstFromPreorder(preorder, bound);
        return parent;
    }

    public class TreeNode {
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
