package array.findAllNumbersDisappearedArray;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 03/01/2019 1:41 PM
 */
public class FindAllNumbersDisappearedArrayTest {

    @Test
    public void findDisappearedNumbers() {
        FindAllNumbersDisappearedArray solution = new FindAllNumbersDisappearedArray();
        int[] nums = new int[]{4,2,3,7,8,2,3,1};
        List<Integer> list = solution.findDisappearedNumbers(nums);
        System.out.println(list);
    }
}