package array.heightChecker;

import java.util.Arrays;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 05/21/2020 5:14 PM
 */
public class HeightChecker {

    //not a well define problem
    public int heightChecker(int[] heights) {
        int[] arr = Arrays.copyOf(heights, heights.length);
        Arrays.sort(arr);
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != heights[i]) cnt++;
        }
        return cnt;
    }
}
