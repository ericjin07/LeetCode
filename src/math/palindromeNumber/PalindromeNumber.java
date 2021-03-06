package math.palindromeNumber;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 08/03/2018 9:28
 */

/*************************************************************************************************
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 *
 * Example 1:
 *
 * Input: 121
 * Output: true
 * Example 2:
 *
 * Input: -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 *
 * Input: 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 *************************************************************************************************/
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

