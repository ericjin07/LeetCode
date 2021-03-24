package stack.pattern132;

import java.util.Deque;
import java.util.LinkedList;

public class Pattern132 {

    public boolean find132pattern(int[] nums) {
        Deque<Integer> stack = new LinkedList<>();
        int len = nums.length;
        int k = Integer.MIN_VALUE;
        for (int i = len - 1; i >= 0; i--) {
            if (nums[i] < k) return true;
            while(!stack.isEmpty() && stack.peek() < nums[i]) {
                k = Math.max(k, stack.pop());
            }
            stack.push(nums[i]);
        }
        return false;
    }
}
