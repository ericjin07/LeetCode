package string.isSbuSequence;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 06/09/2020 4:59 PM
 */
public class IsSubsequence {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            while (i < 10) {
                if (i++ == 2) break;
            }
            System.out.println("break" + i );
        }
    }

    public boolean isSubsequence(String s, String t) {
        int pointS = 0, pointT = 0;
        for (int i = 0; i < t.length(); i++) {
            pointT = i;
            boolean diff = false;
            while (pointS < s.length() && pointT < t.length()) {
                if (t.charAt(pointT) == s.charAt(pointS)) {
                    pointT++;
                    pointS++;
                } else {
                    diff = true;
                    break;
                }
            }
            return !diff;
        }
        return s.equals(t);
    }
}
