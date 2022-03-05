package string.findLUSlength;

public class FindLUSlength {

    public int findLUSlength(String a, String b) {
        return !a.equals(b) ? Math.max(a.length(), b.length()) : -1;
    }
}
