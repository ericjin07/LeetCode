package com.eric.binarySearch;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 06/05/2020 2:44 PM
 */
public class FIndFirstGreaterBinarySearch {

    public static void main(String[] args) {
        FIndFirstGreaterBinarySearch search = new FIndFirstGreaterBinarySearch();
        int[] a = new int[] {1,3,4,5,6,12,23,23,23,55,57,76};
        System.out.println(search.find(a, a.length, 77));
    }

    public int find(int[] a, int n, int key) {
        if (a == null || n == 0) return -1;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] >= key) high = mid - 1;
            else low = mid + 1;
        }
        if (low < n && a[low] >= key) return low;
        return -1;
    }
}
