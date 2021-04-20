package string.implementStrStr;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 08/28/2018 10:07
 */
public class ImplementStr {

    public int strStr(String haystack, String needle) {
        char[] h = haystack.toCharArray(), n = needle.toCharArray();
        int hLen = h.length, nLen = n.length;
        if (nLen == 0) return 0;
        if (hLen == 0) return -1;
        int max = hLen - nLen;
        for (int i = 0; i <= max; i++) {
            if (h[i] != n[0]) {
                // look for the first same char
                while (++i <= max && h[i] != n[0]);
            }
            if (i <= max) {
                int j = i + 1;
                int end = j + nLen - 1;
                for (int k = 1; j < end && h[j] == n[k]; j++, k++);
                if (j == end) {
                    // found the whole string
                    return i;
                }
            }
        }
        return -1;
    }

    public int strStr_2(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
