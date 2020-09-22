package string.detectCapital;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 08/03/2020 4:51 PM
 */
public class DetectCapital {

    public boolean detectCapitalUse(String word) {
        int len = word.length();
        if (len == 1) return true;

        //All capital
        if (Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))) {
            for (int i = 2; i < len; i++) {
                if (Character.isLowerCase(word.charAt(i))) return false;
            }
        } else {
            // the second and next must be all lower case
            for (int i = 1; i < len; i++) {
                if (Character.isUpperCase(word.charAt(i))) return false;
            }
        }
        return true;
    }

}
