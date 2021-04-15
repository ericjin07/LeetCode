package math.uglyNumber;

public class UglyNumber {

    public boolean isUgly(int n) {
        if (n <= 0) return false;
        int[] factors = new int[]{2,3,5};
        for (int factor : factors) {
            while (n % factor == 0) {
                n /= factor;
            }
        }
        return n == 1;
    }
}