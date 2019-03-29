package array.maximumProductofThreeNumbers;


import org.junit.Test;
import static org.junit.Assert.*;

public class MaximumProductofThreeNumbersTest {

    @Test
    public void maximumProduct() {
        int[] arr = new int[]{-1,-2,1,2,3};
        MaximumProductofThreeNumbers solution = new MaximumProductofThreeNumbers();
        assertEquals(6,solution.maximumProduct(arr));
    }
}