package tree.binarySearchTreeIterator;

import java.util.ArrayList;

public class BSTIterator {

    private ArrayList<Integer> list;
    private int cursor;

    public BSTIterator(TreeNode root) {
        list = new ArrayList<>();
        cursor = 0;
        inOrderTraversal(root);
    }

    private void inOrderTraversal(TreeNode root) {
        if (root == null) return;
        inOrderTraversal(root.left);
        list.add(root.val);
        inOrderTraversal(root.right);
    }

    public int next() {
        return list.get(cursor++);
    }

    public boolean hasNext() {
        return cursor < list.size();
    }
}
