package tree.constructBSTfromPreorderTraversal;

import java.util.Stack;

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

    public TreeNode bstFromPreorder_stack(int[] preorder) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode root = new TreeNode(preorder[0]);
        stack.push(root);
        for (int j = 1; j < preorder.length; j++) {
            TreeNode node = new TreeNode(preorder[j]);
            if (preorder[j] < stack.peek().val) {
                stack.peek().left = node;
            } else {
                TreeNode parent = stack.peek();
                while (!stack.isEmpty() && stack.peek().val < preorder[j]) {
                    parent = stack.pop();
                }
                parent.right = node;
            }
            stack.push(node);
        }
        return root;
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
