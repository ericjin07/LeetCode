package dynamicProgram.russianDollEnvelopes;

import org.junit.Test;

import static org.junit.Assert.*;

public class RussianDollEnvelopesTest {

    @Test
    public void maxEnvelopes() {
        int[][] env = new int[][] {{46,89},{50,53},{52,68},{72,45},{77,81}};
        RussianDollEnvelopes test = new RussianDollEnvelopes();
        int maxEnvelopes = test.maxEnvelopes(env);
        assertEquals(3, maxEnvelopes);
    }
}