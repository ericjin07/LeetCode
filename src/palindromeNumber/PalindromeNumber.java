package palindromeNumber;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 08/03/2018 9:28
 */
public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        boolean isPalindrome = false;
        if (x >= 0 && x < 10) {
            isPalindrome = true;
        } else if (x < 0) {
            isPalindrome = false;
        } else {
            int result = 0;

            for(int copyX = x; copyX > 0; copyX /= 10) {
                result = copyX % 10 + result * 10;
            }

            if (result == x) {
                isPalindrome = true;
            }
        }

        return isPalindrome;
    }

    //Revert half of the number
    public static boolean isPalindrome_Modify(int x) {

        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // When the length is an odd number, we can get rid of the middle digit by revertedNumber/10
        // For example when the input is 12321, at the end of the while loop we get x = 12, revertedNumber = 123,
        // since the middle digit doesn't matter in palidrome(it will always equal to itself), we can simply get rid of it.
        return x == revertedNumber || x == revertedNumber/10;
    }
}

