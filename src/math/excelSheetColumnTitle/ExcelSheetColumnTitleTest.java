package math.excelSheetColumnTitle;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 12/17/2018 8:50 AM
 */
public class ExcelSheetColumnTitleTest {

    @Test
    public void convertToTitle() {
        ExcelSheetColumnTitle solution = new ExcelSheetColumnTitle();
        assertEquals("A",solution.convertToTitle(1));
        assertEquals("AZ",solution.convertToTitle(52));
        assertEquals("ZX",solution.convertToTitle(700));

    }
}