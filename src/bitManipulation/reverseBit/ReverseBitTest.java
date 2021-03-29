package bitManipulation.reverseBit;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseBitTest {

    @Test
    public void reverseBits() {
        System.out.println(Integer.toBinaryString(2220));
        System.out.println(Integer.toBinaryString(new ReverseBit().reverseBits(2220)));
    }
}