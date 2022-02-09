package bitManipulation.numberOf1Bits;

public class NumberOf1Bits {

    public int hammingWeight(int n) {
        int cnt = 0;
        while (n != 0) {
            cnt += n & 1;
            n >>>= 1;   // >>> logic change high bit to 0, >> arithmetic change high bit to sign
        }
        return cnt;
    }

    /**
     * n & (n - 1) will remove the latest 1 of the number
     */
    public int hammingWeight_2(int n) {
        int cnt = 0;
        while (n != 0) {
            n = n & (n - 1);
            cnt++;
        }
        return cnt;
    }
}
