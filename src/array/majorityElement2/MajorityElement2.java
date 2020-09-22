package array.majorityElement2;

import java.util.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 09/22/2020 9:17 PM
 */

/**
 * Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
 *
 * Note: The algorithm should run in linear time and in O(1) space.
 *
 * Example 1:
 *
 * Input: [3,2,3]
 * Output: [3]
 * Example 2:
 *
 * Input: [1,1,1,3,3,2,2,2]
 * Output: [1,2]
 */
public class MajorityElement2 {

    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> count = new HashMap<>();
        for (int n : nums) {
            count.compute(n, (k, v) -> v != null ? v+1 : 1);
        }
        for (Map.Entry<Integer, Integer> c : count.entrySet()) {
            if (c.getValue() > nums.length / 3) res.add(c.getKey());
        }
        return res;
    }

    //There is only two element so two candidate
    public List<Integer> majorityElement_2(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int candidate1 = 0;
        int candidate2 = 0;
        int cnt1 = 0, cnt2 = 0;
        for (int n : nums) {
            if (n == candidate1) {
                cnt1++;
                continue;
            }
            if (n == candidate2) {
                cnt2++;
                continue;
            }
            if (cnt1 == 0) {
                candidate1 = n;
                cnt1 = 1;
                continue;
            }
            if (cnt2 == 0) {
                candidate2 = n;
                cnt2 = 1;
                continue;
            }
            cnt1--;
            cnt2--;
        }
        cnt1 = 0;
        cnt2 = 0;
        for (int n : nums) {
            if (n == candidate1) cnt1++;
            else if (n == candidate2) cnt2++;
        }
        if (cnt1 > nums.length / 3) res.add(candidate1);
        if (cnt2 > nums.length / 3) res.add(candidate2);

        return res;
    }
}
