package com.eric.binarySearch;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 06/05/2020 2:59 PM
 */
public class FindLastSmallBinarySearch {

    public static void main(String[] args) {
        FindLastSmallBinarySearch search = new FindLastSmallBinarySearch();
        int[] a = new int[] {1,3,4,5,6,12,23,23,23,55,57,76};
        System.out.println(search.find(a, a.length, 77));
        System.out.println(search.find_2(a, a.length, 77));
    }

    public int find(int[] a, int n, int key) {
        if (a == null || n == 0) return -1;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] <= key) low = mid + 1;
            else high = mid - 1;
        }
        if (high >=0 && a[high] <= key) return high;
        return -1;
    }

    public int find_2(int[] a, int n, int key) {
        if (a == null || n == 0) return -1;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] > key) high = mid - 1;
            else {
                if (mid == n - 1 || a[mid + 1] > key) return mid;
                low = mid + 1;
            }
        }
        return -1;
    }
}
