package stack.nextGreaterElement_2;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class NextGreaterElement_2Test {

    @Test
    public void nextGreaterElements() {
        int[] arr = new int[] {1,1,2,1,1};
        NextGreaterElement_2 solution = new NextGreaterElement_2();
        int[] ints = solution.nextGreaterElements_2(arr);
        System.out.println(Arrays.toString(ints));
    }
}