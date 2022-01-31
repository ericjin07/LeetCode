package string.reverseWordsInString;

public class ReverseWordsInString {

    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(reverseWord(word)).append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    private String reverseWord(String word) {
        char[] s = word.toCharArray();
        int l = 0, r = s.length - 1;
        while (l < r) {
            char tmp = s[l];
            s[l] = s[r];
            s[r] = tmp;
            l++;
            r--;
        }
        return new String(s);
    }
}
