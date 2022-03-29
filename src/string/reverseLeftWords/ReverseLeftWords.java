package string.reverseLeftWords;

public class ReverseLeftWords {

    public String reverseLeftWords(String s, int n) {
        int len = s.length();
        char[] chars = new char[len];
        char[] sChar = s.toCharArray();
        for (int i = 0; i < n; i++) {
            chars[len - n + i] = sChar[i];
        }
        for (int i = n; i < len; i++) {
            chars[i - n] = sChar[i];
        }
        return new String(chars);
    }

    public String reverseLeftWords_internal_function(String s, int n) {
        return s.substring(n).concat(s.substring(0, n));
    }
}
