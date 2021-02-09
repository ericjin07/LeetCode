package array.subarraysWithKdifferentIntegers;

public class SubarraysWithKdifferentIntegers {

    public int subarraysWithKDistinct(int[] A, int K) {
        return mostKDistinct(A,K) - mostKDistinct(A, K - 1);
    }

    private int mostKDistinct(int[] A, int K) {
        int left = 0, right = 0, distinct = 0, res = 0;
        int len = A.length;
        int[] counter = new int[len + 1];
        while (right < len) {
            if (counter[A[right]]++ == 0) {
                distinct++;
            }

            while (distinct > K) {
                if (--counter[A[left++]] == 0) {
                    distinct--;
                }
            }
            res += (right - left + 1);
            right++;
        }
        return res;
    }
}
