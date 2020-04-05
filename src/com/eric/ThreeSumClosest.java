//Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target. Return the sum of the three integers. You may assume that each input would have exactly one solution.
//
// Example: 
//
// 
//Given array nums = [-1, 2, 1, -4], and target = 1.
//
//The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
// 
// Related Topics Array Two Pointers
package com.eric;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
    }

    // leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            int len = nums.length;
            int ans = nums[0] + nums[1] + nums[2];
            for (int i = 0; i < len - 2; i++) {
                int left = i + 1, right = len - 1;
                while (left < right) {
                    int sum = nums[i] + nums[left] + nums[right];
                    if (sum > target) {
                        while (left < right && nums[right] == nums[right - 1])
                            right--;
                        right--;
                    } else if (sum < target) {
                        while (left < right && nums[left + 1] == nums[left])
                            left++;
                        left++;
                    } else {
                        return sum;
                    }
                    if (Math.abs(sum - target) < Math.abs(ans - target)) {
                        ans = sum;
                    }
                }
            }
            return ans;
        }
    }
    // leetcode submit region end(Prohibit modification and deletion)

}