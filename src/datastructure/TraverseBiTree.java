package datastructure;

import java.util.Scanner;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 10/09/2018 9:53 AM
 */
public class TraverseBiTree {

    /**
     * 前序遍历
     * @param t
     */
    public static void preOrderTraverse(BiTreeNode t){
        if (t == null)
            return;
        System.out.print(t.data);     //访问结点
        preOrderTraverse(t.lChild);     //访问左节点
        preOrderTraverse(t.rChild);     //访问右节点
    }

    public static void inOrderTraverse(BiTreeNode t){
        if (t == null)
            return;
        inOrderTraverse(t.lChild);     //访问左节点
        System.out.print(t.data);     //访问结点
        inOrderTraverse(t.rChild);     //访问右节点
    }

    public static void postOrderTraverse(BiTreeNode t){
        if (t == null)
            return;
        postOrderTraverse(t.lChild);     //访问左节点
        postOrderTraverse(t.rChild);     //访问右节点
        System.out.print(t.data);     //访问结点
    }

    public static BiTreeNode createBiTree(BiTreeNode t) {
        Scanner s = new Scanner(System.in);
        System.out.print("data: ");
        String str = s.next();
        if ("#".equals(str))
            t = null;
        else {
            t = new BiTreeNode();
            t.data = str;
            createBiTree(t.lChild);     //构造左子树
            createBiTree(t.rChild);     //构造右子树
        }
        return t;
    }

    public static void main(String[] args) {
        BiTreeNode t = null;
        t = createBiTree(t);
        preOrderTraverse(t);
    }
}
