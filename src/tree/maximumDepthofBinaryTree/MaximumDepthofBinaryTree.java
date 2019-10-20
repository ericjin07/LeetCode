package tree.maximumDepthofBinaryTree;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 11/15/2018 9:05 AM
 */

/**
 * Given a binary tree, find its maximum depth.
 *
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 * Note: A leaf is a node with no children.
 *
 * Example:
 *
 * Given binary tree [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its depth = 3.
 */
public class MaximumDepthofBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return depth(root,1);
    }

    private int depth(TreeNode treeNode,int depth) {
        if (treeNode == null)
            return depth - 1;
        int left = depth(treeNode.left,depth + 1);
        int right = depth(treeNode.right,depth + 1);
        return Math.max(left,right);
    }
}
