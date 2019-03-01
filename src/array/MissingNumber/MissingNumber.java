package array.MissingNumber;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 02/12/2019 1:04 PM
 */

/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 *
 * Example 1:
 *
 * Input: [3,0,1]
 * Output: 2
 * Example 2:
 *
 * Input: [9,6,4,2,3,5,7,0,1]
 * Output: 8
 * Note:
 * Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 */
public class MissingNumber {

    public int missingNumber(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        for (int i=0; i < len; i++) {
            if (i != nums[i])
                return i;
        }
        return len+1;
    }

    public int missingNumber_set(int[] nums) {
        int len = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int i:nums)
            set.add(i);
        for (int i=0;i<= len; i++) {
            if (!set.contains(i))
                return i;
        }
        return -1;
    }

    //use  Gauss' Formula
    public int missingNumber_Gauss(int[] nums) {
        int sum = 0;
        int len = nums.length;
        int expSum = (len * (len + 1)) / 2;
        for (int n : nums) sum += n;
        return expSum - sum;
    }
}
