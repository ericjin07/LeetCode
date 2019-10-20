package tree.pathSum;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 11/20/2018 3:11 PM
 */

import tree.minimumDepthofBinaryTree.TreeNode;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all
 * the values along the path equals the given sum.
 *
 * Note: A leaf is a node with no children.
 *
 * Example:
 *
 * Given the below binary tree and sum = 22,
 *
 *       5
 *      / \
 *     4   8
 *    /   / \
 *   11  13  4
 *  /  \      \
 * 7    2      1
 * return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 */
public class PathSum {


    //recursion
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;
        //is leaf
        sum -= root.val;
        if (root.right == null && root.left == null)
            return (sum == 0);
        return hasPathSum(root.left,sum) || hasPathSum(root.right,sum);
    }

    public boolean hasPathSum_iterations(TreeNode root, int sum){
        if (root == null)
            return false;
        LinkedList<TreeNode> stack_node = new LinkedList<>();
        LinkedList<Integer> stack_sum = new LinkedList<>();
        stack_node.push(root);
        stack_sum.push(sum - root.val);
        TreeNode node;
        int curr_sum;
        while (!stack_node.isEmpty()){
            node = stack_node.pollLast();
            curr_sum = stack_sum.pollLast();
            if (node.left == null && node.right == null && curr_sum == 0)
                return true;
            if (node.right != null) {
                stack_node.addLast(node.right);
                stack_sum.addLast(curr_sum - node.right.val);
            }
            if (node.left != null) {
                stack_node.addLast(node.left);
                stack_sum.addLast(curr_sum - node.left.val);
            }
        }
        return false;
    }


    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
