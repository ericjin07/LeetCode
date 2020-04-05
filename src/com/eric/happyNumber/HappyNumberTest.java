package com.eric.happyNumber;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Create by IntelliJ IDEA.
 * Author: Eric Jin
 * Date: 4/3/20 11:36 PM
 */
public class HappyNumberTest {

    @Test
    public void isHappy() {
        HappyNumber happyNumber = new HappyNumber();
        int num = 19;
        assertTrue(happyNumber.isHappy(19));
    }
}