package dynamicProgram.countingBits;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 05/29/2020 7:48 AM
 */
public class CountingBits {

    public int[] countBits(int num) {
        int[] res = new int[num+1];
        res[0] = 0;
        for (int i = 1; i <= num ; i++) {
            if (i % 2 == 0) res[i] = res[i/2];
            else res[i] = res[i/2] + 1;
        }
        return res;
    }

    public int[] countBits_2(int num) {
        int[] res = new int[num+1];
        res[0] = 0;
        int offset = 1;
        for (int i = 1; i <= num; i++) {
            if (offset * 2 == i) offset *= 2;
            res[i] = res[i - offset] + 1;
        }
        return res;
    }
}
