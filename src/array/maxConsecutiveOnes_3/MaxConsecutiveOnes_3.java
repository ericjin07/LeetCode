package array.maxConsecutiveOnes_3;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 03/01/2019 2:42 PM
 */
public class MaxConsecutiveOnes_3 {

    public int longestOnes(int[] A, int K) {
        int res = 0;
        int len = A.length;
        int zeroCnt = 0;

        int left = 0;
        for (int right = 0; right < len; right++) {
            zeroCnt += (1 - A[right]);
            while (zeroCnt > K) {
                if (A[left++] == 0) zeroCnt--;
            }
            res = Math.max(res, right - left + 1);
        }
        return res;
    }
}
