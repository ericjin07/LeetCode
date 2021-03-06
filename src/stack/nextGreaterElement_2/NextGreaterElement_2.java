package stack.nextGreaterElement_2;

import java.util.Arrays;
import java.util.Deque;
import java.util.Stack;

public class NextGreaterElement_2 {

    public int[] nextGreaterElements(int[] nums) {
        Stack<int[]> stack = new Stack<>();
        int len = nums.length;
        int[] res = new int[len];
        Arrays.fill(res, -1);
        for (int i = 0; i < 2 * len - 1;i++) {
            while (!stack.isEmpty() && nums[i % len] > stack.peek()[0]) {
                res[stack.pop()[1]] = nums[i % len];
            }
            if (!stack.isEmpty() && stack.peek()[0] == nums[i % len] && stack.peek()[1] == (i % len)) break;
            stack.push(new int[] {nums[i % len], i % len});
        }
        return res;
    }

    //just put the not solved index in the stack
    public int[] nextGreaterElements_2(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int len = nums.length;
        int[] res = new int[len];
        Arrays.fill(res, -1);
        for (int i = 0; i < 2 * len - 1;i++) {
            while (!stack.isEmpty() && nums[i % len] > nums[stack.peek()]) {
                res[stack.pop()] = nums[i % len];
            }
            stack.push(i % len);
        }
        return res;
    }
}
