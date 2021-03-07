package string.minimumWindowSubstring;

public class MinimumWindowSubstring {

    public String minWindow(String s, String t) {
        boolean[] exists = new boolean[128];
        int[] chars = new int[128];
        int tLen = t.length();
        for (int i = 0; i < tLen; i++) {
            chars[t.charAt(i)]++;
            exists[t.charAt(i)] = true;
        }

        int sLen = s.length();
        int cnt = 0;
        int min = sLen + 1, minL = 0;
        for (int r = 0, l = 0; r < sLen; r++) {
            char c = s.charAt(r);
            if (exists[c]) {
                if (--chars[c] >= 0) {
                    cnt++;
                }
                while (cnt == tLen) {
                    if (r - l + 1  < min) {
                        min = r - l + 1;
                        minL = l;
                    }
                    if (exists[s.charAt(l)] && ++chars[s.charAt(l)] > 0) {
                        cnt--;
                    }
                    l++;
                }
            }
        }
        return min > sLen ? "" : s.substring(minL, minL + min);
    }
}
