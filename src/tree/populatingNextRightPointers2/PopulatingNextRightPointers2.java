package tree.populatingNextRightPointers2;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointers2 {

    // use breath first search
    public Node connect(Node root) {
        if (root == null) {
            return root;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            Node last = null;
            for (int i = 0; i < size; i++) {
                Node cur = queue.poll();
                if (cur.left != null) queue.offer(cur.left);
                if (cur.right != null) queue.offer(cur.right);
                if (i != 0) {
                    last.next = cur;
                }
                last = cur;
            }
        }
        return root;
    }

    // use linked next node
    Node prev = null, nextStart = null;
    public Node connect_next(Node root) {
        if (root == null) {
            return null;
        }
        Node start = root;
        while (start != null) {
            prev = null;
            nextStart = null;  // every level should clear previous one and clear next one
            for (Node i = start; i != null; i = i.next) {
                if (i.left != null) next(i.left);
                if (i.right != null) next(i.right);
            }
            start = nextStart;
        }
        return root;
    }

    private void next(Node node) {
        if (prev != null) {
            prev.next = node;
        }
        if (nextStart == null) {
            nextStart = node;
        }
        prev = node;
    }
}

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
