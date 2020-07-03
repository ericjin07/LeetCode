package datastructure.stringMatch;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 07/03/2020 9:19 AM
 */
public class BM {

    public static void main(String[] args) {
        String a = "abcabcdabcd";
        String b = "abcd";
        System.out.println(bm(a.toCharArray(), a.length(), b.toCharArray(), b.length()));
    }

    private static final int ASC_SIZE = 256;
    public static int bm(char[] a, int n, char[] b, int m) {
        int[] badChar = new int[ASC_SIZE];
        generateBadChar(b, m, badChar);
        int[] suffix = new int[m];
        boolean[] prefix = new boolean[m];
        generateGoodSuffix(b, m, suffix, prefix);
        int i = 0;
        while (i <= n - m) {
            int j;
            for (j = m - 1; j >= 0; j--) {
                if (a[i+j] != b[j]) break;
            }
            if (j < 0) return i; // match the string

            // move the bad char
            int x = (j - badChar[(int) a[i+j]]);
            int y = 0;
            if (j < m - 1) {
                y = moveByGoodSuffix(j, m, suffix, prefix);
            }
            i += Math.max(x, y);
        }
        return -1;
    }

    private static int moveByGoodSuffix(int j, int m, int[] suffix, boolean[] prefix) {
        int k = m - (j + 1); // the length of the good suffix
        if (suffix[k] != -1) return j + 1 -suffix[k];
        for (int r = j + 2; r <= m - 1; r++) {  // check if there is any sub suffix in the prefix
            if (prefix[m-r]) return r;
        }
        // no good suffix
        return m;
    }

    private static void generateBadChar(char[] b, int m, int[] badChar) {
        for (int i = 0; i < ASC_SIZE; i++) {
            badChar[i] = -1;
        }
        for (int i = 0; i < m; i++) {
            badChar[b[i]] = i;
        }
    }

    private static void generateGoodSuffix(char[] b, int m, int[] suffix, boolean[] prefix) {
        for (int i = 0; i < m; i++) {
            suffix[i] = -1;
            prefix[i] = false;
        }
        for (int i = 0; i < m - 1; i++) {
            int j = i;
            int k = 0;
            while (j >= 0 && b[j] == b[m-1-k]) {
                j--;
                k++;
                suffix[k] = j + 1;
//                suffix[++k]= j--;
            }
            if (j == -1) prefix[k] = true;
        }
    }
}
