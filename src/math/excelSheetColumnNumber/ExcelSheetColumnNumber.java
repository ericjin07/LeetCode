package math.excelSheetColumnNumber;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 12/18/2018 3:04 PM
 */

/**
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 *
 * For example:
 *
 *     A -> 1
 *     B -> 2
 *     C -> 3
 *     ...
 *     Z -> 26
 *     AA -> 27
 *     AB -> 28
 *     ...
 * Example 1:
 *
 * Input: "A"
 * Output: 1
 * Example 2:
 *
 * Input: "AB"
 * Output: 28
 * Example 3:
 *
 * Input: "ZY"
 * Output: 701
 */
public class ExcelSheetColumnNumber {

    public int titleToNumber(String s) {
        char[] cs = s.toCharArray();
        int result = 0;
        for (int i = 0; i < cs.length; i++) {
            result = (26 * result + (cs[i] + 1 - 'A'));
        }
        return result;
    }
}
