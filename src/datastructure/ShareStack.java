package datastructure;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 10/03/2018 11:41 AM
 */
public class ShareStack {

    private Object[] data;
    private int top1 ;
    private int top2;
    private int size;

    public ShareStack(int size) {
        this.size = size;
        data = new Object[size];
        top1 = -1;
        top2 = size;
    }

    public int push(Object obj,int stackNumber){
        if (top1+ 1 == top2) {
            return -1;
        }
        if (stackNumber == 1){
            data[++top1] = obj;
        }else if (stackNumber == 2){
            data[--top2] = obj;
        }else {
            return  -1;
        }
        return 0;
    }

    public Object pop(int stackNumber){
        if (stackNumber == 1){
            if (top1 == -1)
                return -1;
            return data[top1--];
        }else if (stackNumber == 2){
            if (top2 == size)
                return -1;
            return data[top2++];
        }else {
            return -1;
        }
    }
}
