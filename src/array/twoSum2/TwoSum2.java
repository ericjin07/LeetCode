package array.twoSum2;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 12/12/2018 6:20 PM
 */

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
 *
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
 *
 * Note:
 *
 * Your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution and you may not use the same element twice.
 * Example:
 *
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 */
public class TwoSum2 {

    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i= 0; i < numbers.length; i++){
            int con = target - numbers[i];
            if (map.containsKey(con)) return new int[]{map.get(con),i + 1};
            map.put(numbers[i],i + 1);
        }
        return null;
    }

    /**
     * 由于是排序的，两个指针一大一小，往中间靠。。
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum_twoptr(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        while (low < high) {
            if (numbers[low] + numbers[high] == target) return new int[]{low, high};
            else if (numbers[low] + numbers[high] < target) low++;
            else high--;
        }
        return new int[] {-1,-1};
    }
}
