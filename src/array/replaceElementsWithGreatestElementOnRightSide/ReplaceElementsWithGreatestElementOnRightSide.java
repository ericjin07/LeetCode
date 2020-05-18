package array.replaceElementsWithGreatestElementOnRightSide;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 05/18/2020 5:20 PM
 *
 * Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
 *
 * After doing so, return the array.
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [17,18,5,4,6,1]
 * Output: [18,6,6,6,1,-1]
 *
 *
 * Constraints:
 *
 * 1 <= arr.length <= 10^4
 * 1 <= arr[i] <= 10^5
 */
public class ReplaceElementsWithGreatestElementOnRightSide {

    public int[] replaceElements(int[] arr) {
        int len = arr.length;
        int max = arr[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            int tmp = arr[i];
            arr[i] = max;
            max = Math.max(tmp, max);
        }
        arr[len-1] = -1;
        return arr;
    }
}
