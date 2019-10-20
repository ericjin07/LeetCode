package tree.symmetricTree;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 11/14/2018 11:51 AM
 */

import java.util.Stack;

/**
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 *
 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * But the following [1,2,2,null,3,null,3] is not:
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 * Note:
 * Bonus points if you could solve it both recursively and iteratively.
 */
public class SymmetricTree {

    //recursively
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return symmetric(root.left, root.right);
    }

    private boolean symmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        if ((left != null && right == null) || (left == null && right != null))
            return false;
        return left.val == right.val && symmetric(left.left, right.right) && symmetric(left.right, right.left);
    }

    //iteratively
    public boolean isSymmetric_iter(TreeNode root) {
        if (root == null)
            return true;
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root.left);
        stack.add(root.right);
        while(!stack.empty()){
            TreeNode right = stack.pop();
            TreeNode left = stack.pop();
            if (right == null && left == null)
                return true;
            if ((left != null && right == null) || (left == null && right != null))
                return false;
            if (left.val != right.val)
                return false;
            stack.add(left.left);
            stack.add(right.right);
            stack.add(left.right);
            stack.add(right.left);
        }
        return true;
    }
}
