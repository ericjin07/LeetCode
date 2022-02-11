package com.eric.binarySearch.findFirstAndLastInSortedArray;

import java.util.Arrays;

public class FindFirstAndLast {

    public static void main(String[] args) {
        int[] arr = new int[]{1};
        System.out.println(Arrays.toString(new FindFirstAndLast().searchRange(arr, 1)));
    }

    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[] {-1,-1};
        if (nums.length == 0) return res;
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int start = low + ((high - low) >> 1);
            if (nums[start] < target) low = start + 1;
            else high = start - 1;
        }
        res[0] = low < nums.length && nums[low] == target ? low : -1;
        low = 0;
        high = nums.length - 1;
        while (low <= high) {
            int end = low + ((high - low) >> 1);
            if (nums[end] <= target) low = end + 1;
            else high = end - 1;
        }
        res[1] = high >= 0 && nums[high] == target ? high : -1;
        return res;
    }
}
