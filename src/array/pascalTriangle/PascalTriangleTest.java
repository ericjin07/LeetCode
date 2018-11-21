package array.pascalTriangle;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 11/21/2018 5:06 PM
 */
public class PascalTriangleTest {

    @Test
    public void generate() {
        PascalTriangle pascalTriangle = new PascalTriangle();
        System.out.println(pascalTriangle.generate(10));
    }
}