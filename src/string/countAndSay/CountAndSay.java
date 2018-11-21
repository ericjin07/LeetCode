package string.countAndSay;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 08/29/2018 13:51
 */

/**
 * The count-and-say sequence is the sequence of integers with the first five terms as following:
 *
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * Given an integer n, generate the nth term of the count-and-say sequence.
 *
 * Note: Each term of the sequence of integers will be represented as a string.
 *
 * Example 1:
 *
 * Input: 1
 * Output: "1"
 * Example 2:
 *
 * Input: 4
 * Output: "1211"
 */
public class CountAndSay {

    public String countAndSay(int n) {
       if (n == 1) return "1";
       String s = countAndSay(n-1);
       StringBuilder sb = new StringBuilder();
       char say = s.charAt(0);
       int cnt = 1;
       for (int i = 1; i < s.length(); i++){
           char c = s.charAt(i);
           if (c == say){
               cnt ++;
           }else {
                sb.append(cnt).append(say);
                say = c;
                cnt = 1;
           }
       }
       sb.append(cnt).append(say);
       return sb.toString();
    }
}
