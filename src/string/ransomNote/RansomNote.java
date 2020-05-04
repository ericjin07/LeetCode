package string.ransomNote;

import java.util.HashMap;
import java.util.Map;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 05/04/2020 2:28 PM
 */
public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] cnt = new int[128];
        for (char c : magazine.toCharArray()) {
            ++cnt[c];
        }
        for (char c : ransomNote.toCharArray()) {
            if (--cnt[c] < 0) return false;
        }
        return true;
    }
}
