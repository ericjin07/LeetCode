package datastructure;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 10/03/2018 11:21 AM
 */
public class TestStack {

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push("stack of the one");
        Object o = stack.pop();
        System.out.println(o);

        ShareStack shareStack = new ShareStack(3);
        Object o1 = shareStack.pop(1);
        shareStack.push("first one",1);
        shareStack.push("second",2);
        shareStack.push("third",1);
        System.out.println(shareStack.push("ff",2));
        System.out.println(o1);
        System.out.println(shareStack.pop(1));
        System.out.println(shareStack.pop(1));
        System.out.println(shareStack.pop(2));
    }
}
