package math.factorialTrailingZeroes;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 12/19/2018 4:50 PM
 */
public class FactorialTrailingZeroes {

    public long trailingZeroes(int n) {
        long res = 0;
        for (long i = 5; n/i > 0; i*=5)
            res += (n/i);
        return (int)res;
    }
}
