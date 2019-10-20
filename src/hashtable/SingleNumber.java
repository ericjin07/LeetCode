package hashtable;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 12/06/2018 9:36 PM
 */

import java.util.HashMap;
import java.util.Map;

/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 *
 * Note:
 *
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Example 1:
 *
 * Input: [2,2,1]
 * Output: 1
 * Example 2:
 *
 * Input: [4,1,2,1,2]
 * Output: 4
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>((nums.length + 1) / 2);
        for (int i = 0; i < nums.length; i++){
            if (!map.containsKey(nums[i]))
                map.put(nums[i],1);
            else map.remove(nums[i]);
        }
        int single = 0;
        for (Integer i : map.keySet())
            single = i;
        return single;
    }

    /**
     * Concept
     *
     * If we take XOR of zero and some bit, it will return that bit
     *  a ^ 0 = a
     * If we take XOR of two same bits, it will return 0
     *  a ^ a = 0
     * a ^ b ^ a = (a ^ a) ^ b = 0 ^ b = b
     * So we can XOR all bits together to find the unique number.
     */
    public int singleNumber_xor(int[] nums) {
        int single = nums[0];
        for (int i = 1; i < nums.length; i++){
            single ^= nums[i];
        }
        return single;
    }

}
