package datastructure;

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
}
