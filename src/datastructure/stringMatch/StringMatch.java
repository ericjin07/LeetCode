package datastructure.stringMatch;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 07/01/2020 9:42 AM
 */
public class StringMatch {

    public static void main(String[] args) {
        StringMatch match = new StringMatch();
        System.out.println(match.contains_Brute_Force("abc", "abdaadsabfc"));
        System.out.println(1<<1);
    }

    public boolean contains_Brute_Force(String s, String t) {
        for (int i = 0; i <= t.length() - s.length(); i++) {
            boolean found = true;
            for (int j = 0; j <= s.length() - 1; j++) {
                if (t.charAt(i + j) != s.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) return true;
        }
        return false;
    }

}
