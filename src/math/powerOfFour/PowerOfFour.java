package math.powerOfFour;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 08/06/2020 6:18 PM
 */
public class PowerOfFour {

    public boolean isPowerOfFour(int num) {
        if (num == 1) return true;
        if (num % 4 != 0) return false;
        while (num > 1) {
            num /= 4;
            if (num != 1 && num % 4 != 0) return false;
        }
        return num == 1;
    }
}
