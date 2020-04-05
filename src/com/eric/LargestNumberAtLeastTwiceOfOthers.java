package com.eric;

//In a given integer array nums, there is always exactly one largest element. 

//
// Find whether the largest element in the array is at least twice as much as every other number in the array. 
//
// If it is, return the index of the largest element, otherwise return -1. 
//
// Example 1: 
//
// 
//Input: nums = [3, 6, 1, 0]
//Output: 1
//Explanation: 6 is the largest integer, and for every other number in the array x,
//6 is more than twice as big as x.  The index of value 6 is 1, so we return 1.
// 
//
// 
//
// Example 2: 
//
// 
//Input: nums = [1, 2, 3, 4]
//Output: -1
//Explanation: 4 isn't at least as big as twice the value of 3, so we return -1.
// 
//
// 
//
// Note: 
//
// 
// nums will have a length in the range [1, 50]. 
// Every nums[i] will be an integer in the range [0, 99]. 
// 
//
// 
// Related Topics Array

public class LargestNumberAtLeastTwiceOfOthers {

    public static void main(String[] args) {
        Solution solution = new LargestNumberAtLeastTwiceOfOthers().new Solution();
        int[] nums = new int[] { 1, 0 };
        int res = solution.dominantIndex(nums);
        System.out.println(res);
    }

    /**
     * keep two number, largest and the second largest.
     */
    // leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int dominantIndex(int[] nums) {
            if (nums == null || nums.length == 0)
                return -1;
            int len = nums.length;
            if (len == 1)
                return 0;
            int index = -1;
            int largest = Integer.MIN_VALUE + 1, sencondLargest = Integer.MIN_VALUE;
            for (int i = 0; i < len; i++) {
                if (nums[i] > largest) {
                    sencondLargest = largest;
                    largest = nums[i];
                    index = i;
                } else if (nums[i] > sencondLargest) {
                    sencondLargest = nums[i];
                }
            }
            return sencondLargest * 2 <= largest ? index : -1;
        }
    }
    // leetcode submit region end(Prohibit modification and deletion)

}