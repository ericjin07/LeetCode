package array.largestNumber;

import java.util.Arrays;

public class LargestNumber {

    public String largestNumber(int[] nums) {
        String[] strs = new String[nums.length];
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            strs[i] = "" + nums[i];
        }
        Arrays.sort(strs, (a, b) -> {
            String ab = a + b, ba = b + a;
            return ba.compareTo(ab);
        });
        StringBuilder sb = new StringBuilder();
        for (String s : strs) sb.append(s);
        int k = 0;
        while (k < sb.length() - 1 && sb.charAt(k) == '0') k++;
        return sb.substring(k);
    }
}
