package com.eric.validPerfectSquare;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 05/09/2020 4:53 PM
 */
public class ValidPerfectSquareTest {

    @Test
    public void isPerfectSquare() {
        ValidPerfectSquare square = new ValidPerfectSquare();
        assertEquals(false, square.isPerfectSquare(2147483647));
    }
}