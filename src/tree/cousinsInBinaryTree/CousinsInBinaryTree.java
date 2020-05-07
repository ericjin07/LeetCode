package tree.cousinsInBinaryTree;

/**
 * In a binary tree, the root node is at depth 0, and children of each depth k node are at depth k+1.
 *
 * Two nodes of a binary tree are cousins if they have the same depth, but have different parents.
 *
 * We are given the root of a binary tree with unique values, and the values x and y of two different nodes in the tree.
 *
 * Return true if and only if the nodes corresponding to the values x and y are cousins.
 */
public class CousinsInBinaryTree {

    class Pair {
        TreeNode parent;
        int depth;

        public Pair(TreeNode parent, int depth) {
            this.parent = parent;
            this.depth = depth;
        }
    }

    public boolean isCousins(TreeNode root, int x, int y) {
        Pair left = helper(root, x, null, 0);
        Pair right = helper(root, y, null, 0);
        return left.depth == right.depth && left.parent != right.parent;
    }

    private Pair helper(TreeNode node, int value, TreeNode parent, int depth) {
        if (node == null) return null;
        if (node.val == value) return new Pair(parent, depth);
        Pair left = helper(node.left, value, node, depth + 1);
        Pair right = helper(node.right, value, node, depth + 1);
        return left == null ? right : left;
    }
}

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }