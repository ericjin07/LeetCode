package array.longestSubarray;

import java.util.Deque;
import java.util.LinkedList;
import java.util.TreeMap;

public class LongestSubarray {

    //use Heap data structure
    public int longestSubarray(int[] nums, int limit) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int len = nums.length, left = 0, res = 0;
        for (int i = 0; i < len; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            while (map.lastKey() - map.firstKey() > limit) {
                map.put(nums[left], map.get(nums[left]) - 1);
                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }
                left++;
            }
            res = Math.max(res, i - left + 1);
        }
        return res;
    }

    // use two queue
    public int longestSubarray_2(int[] nums, int limit) {
        Deque<Integer> maxQue = new LinkedList<>();
        Deque<Integer> minQue = new LinkedList<>();
        int len = nums.length, left = 0, res = 0;
        for (int i = 0; i < len; i++) {
            while (!maxQue.isEmpty() && nums[i] > maxQue.peekLast()) {
                maxQue.pollLast();
            }
            while (!minQue.isEmpty() && nums[i] < minQue.peekLast()) {
                minQue.pollLast();
            }
            maxQue.offerLast(nums[i]);
            minQue.offerLast(nums[i]);
            while (maxQue.peekFirst() - minQue.peekFirst() > limit) {
                if (nums[left] == minQue.peekFirst()) {
                    minQue.pollFirst();
                }
                if (nums[left] == maxQue.peekFirst()) {
                    maxQue.pollFirst();
                }
                left++;
            }
            res = Math.max(res, i - left + 1);
        }
        return res;
    }
}
