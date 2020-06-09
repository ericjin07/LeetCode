package string.isSubsequence;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 06/09/2020 9:49 PM
 */
public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) return false;
        if (s.length() == t.length() && s.length() == 0) return true;

        int pointS =0;
        for (int i = 0; i < t.length() && pointS < s.length(); i++) {
            if (s.charAt(pointS) == t.charAt(i)) pointS++;
        }
        return pointS == s.length();
    }

}
