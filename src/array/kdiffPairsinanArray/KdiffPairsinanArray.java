package array.kdiffPairsinanArray;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 03/05/2019 2:32 PM
 */

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers and an integer k, you need to find the number of unique k-diff pairs in the array.
 * Here a k-diff pair is defined as an integer pair (i, j),
 * where i and j are both numbers in the array and their absolute difference is k.
 *
 * Example 1:
 * Input: [3, 1, 4, 1, 5], k = 2
 * Output: 2
 * Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
 * Although we have two 1s in the input, we should only return the number of unique pairs.
 * Example 2:
 * Input:[1, 2, 3, 4, 5], k = 1
 * Output: 4
 * Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).
 * Example 3:
 * Input: [1, 3, 1, 5, 4], k = 0
 * Output: 1
 * Explanation: There is one 0-diff pair in the array, (1, 1).
 * Note:
 * The pairs (i, j) and (j, i) count as the same pair.
 * The length of the array won't exceed 10,000.
 * All the integers in the given input belong to the range: [-1e7, 1e7].
 */
public class KdiffPairsinanArray {

    /**
     * 思路：把数组每个元素放到hashmap中，并对个数计数。
     * 第二次遍历时：如果 k 为0， 则计算map 中个数超过1次的
     * 如果k 不为0，看map 中是否存在 key +k
     * @param nums
     * @param k
     * @return
     */
    public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length <= 1 || k < 0) return 0;
        Map<Integer,Integer> map = new HashMap<>();

        for (int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int cnt = 0;
        for (Map.Entry<Integer,Integer> entry: map.entrySet()){
            if (k == 0) {
                if (entry.getValue() >= 2) cnt++;
            } else {
                if (map.containsKey(entry.getKey() + k)) cnt++;
            }
        }
        return cnt;
    }
}
