package array.validMountainArray;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 05/11/2020 10:18 PM
 */
public class ValidMountainArray {

    public boolean validMountainArray(int[] A) {
        if (A.length < 3) return false;
        int left = 0, right = A.length - 1;
        while (left < right) {
            if (A[left] == A[left + 1]) return false;
            else if (A[left] > A[left + 1]) break;
            else left++;
        }
        while (right > 0) {
            if (A[right] == A[right - 1]) return false;
            else if (A[right] > A[right - 1]) break;
            else right--;
        }
        return left != 0 && right != A.length - 1 && left == right;
    }
}
