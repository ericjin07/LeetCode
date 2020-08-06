package array.findAllDuplicatesInArray;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 08/06/2020 6:47 PM
 */
public class FindAllDuplicatesInArray {

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) res.add(Math.abs(nums[i]));
            else nums[index] = -nums[index];
        }
        return res;
    }
}
