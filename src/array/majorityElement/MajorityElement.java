package array.majorityElement;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 12/17/2018 2:15 PM
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 *
 * You may assume that the array is non-empty and the majority element always exist in the array.
 *
 * Example 1:
 *
 * Input: [3,2,3]
 * Output: 3
 * Example 2:
 *
 * Input: [2,2,1,1,1,2,2]
 * Output: 2
 */
public class MajorityElement {

    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i))
                map.put(i,map.get(i) + 1);
            else map.put(i,1);
        }
        System.out.println(map);
        Iterator<Integer> keys = map.keySet().iterator();
        while (keys.hasNext()) {
            int k = keys.next();
            int v = map.get(k);
            if (v > nums.length / 2)
                return k;
        }
        return -1;
    }

    /**
     * 由于有一个数大于一半，所以对数字进行加减，最后那个就是多余的
     * @param nums
     * @return
     */
    public int majorityElement_cnt(int[] nums) {
        int count = 0;
        int maj = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                count++;
                maj = nums[i];
            }else if (maj == nums[i]) count++;
            else count--;
        }
        return maj;
    }
}
