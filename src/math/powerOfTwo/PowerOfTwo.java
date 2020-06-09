package math.powerOfTwo;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 06/09/2020 4:42 PM
 *
 * Given an integer, write a function to determine if it is a power of two.
 *
 * Example 1:
 *
 * Input: 1
 * Output: true
 * Explanation: 20 = 1
 * Example 2:
 *
 * Input: 16
 * Output: true
 * Explanation: 24 = 16
 * Example 3:
 *
 * Input: 218
 * Output: false
 */
public class PowerOfTwo {

    public static void main(String[] args) {
        PowerOfTwo two = new PowerOfTwo();
        System.out.println(two.isPowerOfTwo(1));
        System.out.println(two.isPowerOfTwo(16));
        System.out.println(two.isPowerOfTwo(218));
    }

    public boolean isPowerOfTwo(int n) {
        if (n == 1) return true;
        if (n % 2 == 1) return false;
        while (n > 1) {
            n /= 2;
            if (n != 1 && n % 2 == 1) return false;
        }
        return n == 1;
    }

    public boolean isPowerOfTwo_bitwise(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
