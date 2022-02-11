package com.eric.binarySearch.searchRotatedSortedArray;

public class SearchRotatedSortedArray {

    public int search(int[] nums, int target) {
        int n = nums.length - 1;
        int low = 0, high = n;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (nums[mid] == target) return mid;
            if (nums[0] > nums[mid]) {
                if (target > nums[mid] && target < nums[0]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } else {
                if (target < nums[mid] && target >= nums[0]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }
}
