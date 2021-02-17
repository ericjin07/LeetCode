package greedy.candy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CandyTest {

    @Test
    public void candy() {
        Candy candy = new Candy();
        int [] rating = new int[] {1,0,2};
        int res = candy.candy(rating);
        Assert.assertEquals(5, res);
    }
}