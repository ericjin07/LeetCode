package array.checkIfDoubleExist;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 05/11/2020 9:49 PM
 *Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).
 *
 * More formally check if there exists two indices i and j such that :
 *
 * i != j
 * 0 <= i, j < arr.length
 * arr[i] == 2 * arr[j]
 *
 *
 * Example 1:
 *
 * Input: arr = [10,2,5,3]
 * Output: true
 * Explanation: N = 10 is the double of M = 5,that is, 10 = 2 * 5.
 * Example 2:
 *
 * Input: arr = [7,1,14,11]
 * Output: true
 * Explanation: N = 14 is the double of M = 7,that is, 14 = 2 * 7.
 * Example 3:
 *
 * Input: arr = [3,1,7,11]
 * Output: false
 * Explanation: In this case does not exist N and M, such that N = 2 * M.
 *
 *
 * Constraints:
 *
 * 2 <= arr.length <= 500
 * -10^3 <= arr[i] <= 10^3
 */
public class CheckIfDoubleExist {

    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            // i % 2 is check for the i is even. only even need to be check the set.
            // and if the i is odd. like 5, 5 / 2 = 2, may be set contains 2. but it's not the double.
            // so check the even number.
            if (set.contains(i * 2) || (i % 2 == 0 && set.contains(i / 2))) return true;
            set.add(i);
        }
        return false;
    }
}
