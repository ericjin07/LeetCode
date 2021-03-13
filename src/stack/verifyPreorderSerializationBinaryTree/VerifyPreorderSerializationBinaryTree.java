package stack.verifyPreorderSerializationBinaryTree;

import datastructure.Stack;

import java.util.Deque;
import java.util.LinkedList;

public class VerifyPreorderSerializationBinaryTree {

    //diff = out - in
    // and init the root diff just 2 out
    // while iterator to the last node, the out if more than in
    public boolean isValidSerialization(String preorder) {
        int diff = 1;
        for (String node : preorder.split(",")) {
            diff -= 1;
            if (diff < 0) return false;
            if (!"#".equals(node)) diff += 2;
        }
        return diff == 0;
    }

    //diff = out - in
    public boolean isValidSerialization_1(String preorder) {
        int diff = 1;
        int i = 0, len = preorder.length();
        while (i < len) {
            if (diff == 0) return false;
            if (preorder.charAt(i) == ',') i++;
            else if (preorder.charAt(i) == '#') {
                i++;
                diff--;
            } else {
                // a number
                while (i < len && preorder.charAt(i) != ',') {
                    i++;
                }
                diff++;
            }
        }
        return diff == 0;
    }
}
