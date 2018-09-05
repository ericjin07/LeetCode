package lengthOfLastWord;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 09/05/2018 4:59 PM
 */

/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 *
 * If the last word does not exist, return 0.
 *
 * Note: A word is defined as a character sequence consists of non-space characters only.
 *
 * Example:
 *
 * Input: "Hello World"
 * Output: 5
 */
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        s = s.trim();
        int lc = s.lastIndexOf(' ');
        return s.length() - (lc+1);
    }

    public int lengthOfLastWord1(String s) {
       if (s == null || s.trim().length() == 0) return 0;
       int length = 0;
       int start = s.length()-1;
       while(start >= 0 && s.charAt(start) == ' ')
           start --;

       for (int i = start; i >= 0 ; i--) {
           if (s.charAt(i) == ' '){
               return length;
           }
           length++;
       }
       return length;
    }
}
