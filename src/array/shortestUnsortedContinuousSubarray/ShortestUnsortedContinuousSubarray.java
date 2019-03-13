package array.shortestUnsortedContinuousSubarray;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 02/21/2019 9:35 AM
 */

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Given an integer array, you need to find one continuous subarray that if you only sort this subarray in ascending order,
 * then the whole array will be sorted in ascending order, too.
 *
 * You need to find the shortest such subarray and output its length.
 *
 * Example 1:
 * Input: [2, 6, 4, 8, 10, 9, 15]
 * Output: 5
 * Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.
 * Note:
 * Then length of the input array is in range [1, 10,000].
 * The input array may contain duplicates, so ascending order here means <=.
 */
public class ShortestUnsortedContinuousSubarray {

    /**
     * 思路：给数组做一个备份，然后排序数组。
     * 遍历数组，如果原数组和排序的新数组元素不等，这个位置就是需要排序的点，记录下来。
     * @param nums
     * @return
     */
    public int findUnsortedSubarray(int[] nums) {
        if (nums == null || nums.length <= 0)
            return 0;
        int len = nums.length;
        int start = len;
        int end = 0;
        int[] cnums = nums.clone();
        Arrays.sort(cnums);
        for (int i = 0; i < len; i++) {
            if (nums[i] != cnums[i]){
                start = Math.min(i,start);
                end = Math.max(i,end);
            }
        }
        return (end - start) >= 0 ? end - start + 1 : 0;
    }

    /**
     * 思路：用栈，遍历数组，如果后一个数比前一个大，就把元素当前的下标放入栈中，一旦遇到后一个比前一个小的，就把栈最上面的索引取出来
     * 跟当前元素对比，直到栈最上面的索引元素比遍历元素大。从栈中取出的元素就是需要排序的正确位置。
     * 相反，最大的从后面遍历元素。
     * @param nums
     * @return
     */
    public int findUnsortedSubarray_stack(int[] nums) {
        if (nums == null || nums.length <= 0)
            return 0;
        LinkedList<Integer> stack = new LinkedList<>();
        int len = nums.length;
        int start = len,end = 0;
        for (int i = 0; i < len; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] > nums[i])
                start = Math.min(start,stack.pop());
            stack.push(i);
        }
        stack.clear();
        for (int i = len - 1; i >=0 ; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i])
                end = Math.max(end,stack.pop());
            stack.push(i);
        }
        return (end - start) > 0 ? end - start + 1 : 0;
    }

    /**
     * 思路：找到非递增或递减中的最小最大值
     * 然后与数组元素比较，一旦比最小比遍历元素小，就放在此处
     * @param nums
     * @return
     */
    public int findUnsortedSubarray_boundary(int[] nums) {
        if (nums == null || nums.length <= 0)
            return 0;
        int len = nums.length;
        int min = Integer.MAX_VALUE,max = Integer.MIN_VALUE;
        //当后一个小于前一个时，比较得出最小的元素，是为之后界定最小边界
        for (int i = 1; i < len; i++) {
            if (nums[i - 1] > nums[i])
                min = Math.min(min,nums[i]);
        }
        //当前一个元素大于后一个元素，比较得出最大元素，是为之后界定最大边界
        for (int i = len - 2; i >= 0; i--) {
            if (nums[i] > nums[i+1])
                max = Math.max(max,nums[i]);
        }
        int l,r;
        for (l = 0; l < len; l++)
            if (min < nums[l])
                break;
        for (r  = len - 1; r >= 0 ; r--)
            if (max > nums[r])
                break;
        return (r - l) > 0 ? (r - l + 1) : 0;

    }

}
