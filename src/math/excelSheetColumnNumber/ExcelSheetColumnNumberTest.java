package math.excelSheetColumnNumber;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 12/18/2018 3:16 PM
 */
public class ExcelSheetColumnNumberTest {

    @Test
    public void titleToNumber() {
        ExcelSheetColumnNumber solution = new ExcelSheetColumnNumber();
        assertEquals(27,solution.titleToNumber("AA"));

    }
}