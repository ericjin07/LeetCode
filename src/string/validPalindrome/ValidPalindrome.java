package string.validPalindrome;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 12/06/2018 8:44 PM
 */

/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 *
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 *
 * Example 1:
 *
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 * Example 2:
 *
 * Input: "race a car"
 * Output: false
 */
public class ValidPalindrome {

    /**
     * 前后两个指针，前指针比后指针小，调过非数字字母，然后大小写非敏感比较
     * @param s
     * @return
     */
    public boolean isPalindrome(String s) {
        int front = 0;
        int back = s.length() - 1;
        char f,b;
        while (front < back){
            //front
            while (!isAlphNum(f = s.charAt(front)) && front < back)
                front++;
            //back
            while (!isAlphNum(b = (s.charAt(back))) && front < back)
                back--;
            if (Character.toLowerCase(b) != Character.toLowerCase(f))
                return false;
            front++;
            back--;
        }
        return true;
    }

    public boolean isAlphNum(char c){
        return Character.isLetterOrDigit(c);
    }
}
