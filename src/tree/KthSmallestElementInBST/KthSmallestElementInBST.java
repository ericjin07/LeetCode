package tree.KthSmallestElementInBST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 05/21/2020 9:29 AM
 */
public class KthSmallestElementInBST {

    // 1
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = inorderDFS_recursion(root, new ArrayList<Integer>());
        return list.get(k - 1);
    }

    private List<Integer> inorderDFS_recursion(TreeNode root, List<Integer> list) {
        if (root == null) return list;
        inorderDFS_recursion(root.left, list);
        list.add(root.val);
        inorderDFS_recursion(root.right, list);
        return list;
    }

    // 2
    public int kthSmallest_Iterate(TreeNode root, int k) {
        LinkedList<TreeNode> arr = new LinkedList<>();

        while (true) {
            while (root != null) {
                arr.add(root);
                root = root.left;
            }
            root = arr.removeLast();
            if (--k == 0) return root.val;
            root = root.right;
        }
    }

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