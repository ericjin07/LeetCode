package com.eric.binarySearch;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 06/05/2020 2:22 PM
 */
public class StandardBinarySearch {

    public static void main(String[] args) {
        StandardBinarySearch search = new StandardBinarySearch();
        int[] a = new int[] {1,3,4,5,6,12,23,55,57,76};
        System.out.println(search.find(a, a.length, 11));
     }

    // 没有重复的值
    public int find(int[] a, int n, int key) {
        if (a == null || n == 0) return -1;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] == key) return mid;
            else if (a[mid] > key) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }
}
