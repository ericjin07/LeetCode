package datastructure;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 10/09/2018 9:58 AM
 */
public class TraverseBiTreeTest {
    private BiTreeNode root;
    private BiTreeNode createNode = new BiTreeNode();

    @Before
    public void setUp(){
        root = new BiTreeNode("A");
        BiTreeNode b = new BiTreeNode("B");
        BiTreeNode c = new BiTreeNode("C");
        root.lChild = b;
        root.rChild = c;


        BiTreeNode d = new BiTreeNode("D");
        BiTreeNode e = new BiTreeNode("E");
        b.lChild = d;
        b.rChild = e;

        BiTreeNode f = new BiTreeNode("F");
        BiTreeNode g = new BiTreeNode("G");
        c.lChild = f;
        c.rChild = g;

        BiTreeNode h = new BiTreeNode("H");
        BiTreeNode i = new BiTreeNode("I");
        BiTreeNode k = new BiTreeNode("K");
        BiTreeNode j = new BiTreeNode("J");
        d.rChild = h;
        f.lChild = i;
        g.rChild = j;
        h.rChild = k;
    }

    @Test
    public void preOrderTraverse() {
        TraverseBiTree.preOrderTraverse(root);
    }

    @Test
    public void inOrderTraverse() {
        TraverseBiTree.inOrderTraverse(root);
    }

    @Test
    public void postOrderTraverse() {
        TraverseBiTree.postOrderTraverse(root);
    }

    @Test
    public void createBiTree() {
        TraverseBiTree.createBiTree(createNode);
        TraverseBiTree.preOrderTraverse(createNode);
    }
}