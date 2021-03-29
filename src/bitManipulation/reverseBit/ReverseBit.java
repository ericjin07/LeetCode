package bitManipulation.reverseBit;

public class ReverseBit {

    public int reverseBits(int n) {
        int rev = 0;
        for(int i = 0; i <= 31; i++) {
            rev = (rev << 1) | (n & 1);
            n >>>= 1;
        }
        return rev;
    }
}
