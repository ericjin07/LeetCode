package string.addbinary;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 09/07/2018 9:20 AM
 */

/**
 * Given two binary strings, return their sum (also a binary string).
 *
 * The input strings are both non-empty and contains only characters 1 or 0.
 *
 * Example 1:
 *
 * Input: a = "11", b = "1"
 * Output: "100"
 * Example 2:
 *
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 */
public class AddBinary {

    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length()-1,j = b.length() - 1;
        while (i >= 0 || j >= 0){
            int aChar = i >= 0 ? a.charAt(i--) - '0' : 0;
            int bChar = j >= 0 ? b.charAt(j--) - '0' : 0;
            int sum = aChar + bChar + carry;
            sb.append(sum % 2);
            carry =sum / 2;
        }
        if (carry > 0) sb.append(carry);
        return sb.reverse().toString();
    }

}
