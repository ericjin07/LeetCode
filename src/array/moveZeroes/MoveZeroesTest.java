package array.moveZeroes;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 02/12/2019 5:06 PM
 */
public class MoveZeroesTest {

    @Test
    public void moveZeroes() {
        int[] arr = new int[]{0,1,0,3,12};
        int[] arr2 = new int[]{0,0,1};
        new MoveZeroes().moveZeroes(arr);
        assertEquals("[1, 3, 12, 0, 0]",Arrays.toString(arr));
        new MoveZeroes().moveZeroes(arr2);
        assertEquals("[1, 0, 0]",Arrays.toString(arr2));
    }
}