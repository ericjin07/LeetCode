package dynamicProgram.palindromePartitioning_2;

public class PalindromePartitioning_2 {

    public int minCut(String s) {
        int len = s.length();
        if (len == 1) return 0;
        boolean[][] isPalindrome = new boolean[len][len];
        for (int j = 0; j < len; j++) {
            for (int i = j; i >= 0 ; i--) {
                if (i == j) isPalindrome[i][j] = true;
                else if (j - i == 1) {
                    isPalindrome[i][j] = s.charAt(i) == s.charAt(j);
                } else {
                    isPalindrome[i][j] = isPalindrome[i+1][j-1] && s.charAt(i) == s.charAt(j);
                }
            }
        }

        int[] fn = new int[len];
        for (int i = 0; i < len; i++) {
            if (isPalindrome[0][i]) fn[i] = 0;
            else {
                fn[i] = fn[i-1] + 1;
                for (int j = 1; j < i; j++) {
                    if (isPalindrome[j][i]) {
                        fn[i] = Math.min(fn[i], fn[j-1] + 1);
                    }
                }
            }
        }
        return fn[len - 1];
    }
}
