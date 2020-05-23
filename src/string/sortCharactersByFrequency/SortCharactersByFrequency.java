package string.sortCharactersByFrequency;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 05/23/2020 9:46 PM
 */

public class SortCharactersByFrequency {

    public String frequencySort(String s) {
        int[] chars = new int[256];
        int max = 0;
        for (char c : s.toCharArray()) {
            chars[c]++;
            max = Math.max(chars[c], max);
        }
        String[] bucket = new String[max + 1];
        for (int i = 0; i < 256; i++) {
            String str = bucket[chars[i]];
            if (chars[i] > 0) {
                bucket[chars[i]] = (str == null) ? "" + (char) i : str + (char)i;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = max; i >= 0; i--) {
            if (bucket[i] != null) {
                for (char c : bucket[i].toCharArray())
                    for (int j = 0; j < i; j++)
                        sb.append(c);
            }
        }
        return sb.toString();
    }
}