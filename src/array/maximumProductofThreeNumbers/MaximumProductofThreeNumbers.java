package array.maximumProductofThreeNumbers;

import java.util.Arrays;

public class MaximumProductofThreeNumbers {

    /**
     * Brute Force solution
     * This will cause the Time exceed
     * Time complexity: O(n3)
     * @param nums
     * @return
     */
    public int maximumProduct(int[] nums) {
        int len = nums.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < len - 2; i++) {
            for (int j = 1; j < len - 1; j++) {
                for (int k = 2; k < len; k++) {
                    if (i == j || i == k || j == k) continue;
                    max = Math.max(max,nums[i] * nums[j] * nums[k]);
                }
            }
        }
        return max;
    }

    /**
     * 利用排序的方法。
     * @param nums
     * @return
     */
    public int maximumProduct_sort(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        return Math.max(nums[0] * nums[1] * nums[len -1],nums[len-3] * nums[len - 2] * nums[len - 1]);
    }

    /**
     * 仅仅去查找最小的两个值，和最大的三个值，然后最好比较三数的乘积
     * @param nums
     * @return
     */
    public int maximumProduct_singleScan(int[] nums) {
        int
                min1 = Integer.MAX_VALUE,
                min2 = Integer.MAX_VALUE,
                max1 = Integer.MIN_VALUE,
                max2 = Integer.MIN_VALUE,
                max3 = Integer.MIN_VALUE;
        for (int n : nums) {
            if (n <= min1) {
                min2 = min1;
                min1 = n;
            }else if (n <= min2) {
                min2 = n;
            }
            if (n >= max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            }else if (n >= max2) {
                max3 = max2;
                max2 = n;
            }else if (n >= max3) {
                max3 = n;
            }
        }
        return Math.max(min1 * min2 * max1, max1 * max2 * max3);
    }
}
