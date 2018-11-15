package binaryTreeLevelOrderTraversal_2;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 11/15/2018 9:39 AM
 */

import java.util.*;

/**
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
 *
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its bottom-up level order traversal as:
 * [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 */
public class BinaryTreeLevelOrderTraversal {

    //Breath-First-Search   queue
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> result = new LinkedList<>();
        if (root == null)
            return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> levelTree = new ArrayList<>();
            int size = queue.size();
            for (int i=0; i < size; i++){
                TreeNode node = queue.remove();
                levelTree.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            result.addFirst(levelTree);
        }
        return result;
    }
}
