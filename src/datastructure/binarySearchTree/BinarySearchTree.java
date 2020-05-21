package datastructure.binarySearchTree;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 05/21/2020 2:47 PM
 */
public class BinarySearchTree {

    Node root;

    public Node find(int data) {
        Node p = root;
        while (p != null) {
            if (p.data > data) {
                p = p.right;
            } else if (p.data < data) {
                p = p.left;
            } else {
                return p;
            }
        }
        return null;
    }

    public void insert(int data) {
        if (root == null) {
            root = new Node(data);
            return;
        }
        Node p = root;
        while (true) {
            if (data > p.data) {
                if (p.right == null) {
                    p.right = new Node(data);
                    return;
                }
                p = p.right;
            } else {
                if (p.left == null) {
                    p.left = new Node(data);
                    return;
                }
                p = p.left;
            }
        }
    }

    public void delete(int data) {
        Node p = root;
        Node pp = null;
        // find the Node which want to delete
        while (p != null && p.data != data) {
            if (p.data < data) p = p.right;
            else p = p.left;
        }
        // no data found, then return
        if (p == null) return;
        // If the p has two children. we find the right child's smallest node to replace the p itself.
        if (p.left != null && p.right != null) {
            Node minP = p.right;
            //parent of the min
            Node minPP = p;
            // find the smallest Node, and it will be left node, and will not have a left Node on the p's right.
            while (minP.left != null) {
                minPP = minP;
                minP = minP.left;
            }
            // change the p and the minP 's data, then set p and pp to the minP and minPP(this is to delete the Node there is no child or only one child)
            p.data = minP.data;
            p = minP;
            pp = minPP;
        }

        // this is the delete step.
        Node child;
        // get the p's child point
        if (p.left != null) child = p.left;
        else if (p.right != null) child = p.right;
        else child = null;

        // set pp to p's child
        if (pp == null) root = child; // this is the root node.
        else if (pp.left == p) pp.left = child;
        else pp.right = child;
    }

    static class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
        }
    }
}
