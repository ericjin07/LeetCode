package math.quickSort;

import org.junit.Test;

import java.util.Arrays;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 08/13/2018 9:30
 */
public class QuickSortTest {

    @Test
    public void quickSort() {
        QuickSort qs = new QuickSort();
        int[] arr = new int[]{4,7,6,5,3,2,8,9,1};
        qs.quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}