package com.eric.binarySearch;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 06/05/2020 2:39 PM
 */
public class FindFirstEqualBinarySearch {

    public int find(int[]a, int n, int key) {
        if (a == null || n == 0) return -1;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] > key) high = mid - 1;
            else if (a[mid] < key) low = mid + 1;
            else {
                if (mid == 0 || a[mid - 1] != key) return mid;
                else high = mid - 1;
            }
        }
        if (low < n && a[low] == key) return low;
        return -1;
    }

    public int find_3(int[]a, int n, int key) {
        if (a == null || n == 0) return -1;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] >= key) high = mid - 1;
            else low = mid + 1;
        }
        if (low < n && a[low] == key) return low;
        return -1;
    }
}
