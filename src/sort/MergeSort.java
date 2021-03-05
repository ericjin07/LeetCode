package sort;

import java.util.Arrays;

public class MergeSort {

    static int cnt = 0;

    public static void main(String[] args) {
//        int[] arr = new int[] {3,2,65 ,1,4,2,7,4,98,12,78,5,65};
        int[] arr = new int[] {2,65 ,1};
        System.out.println(Arrays.toString(mergeSort(arr)));
        System.out.println("-:" + cnt);
    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) return arr;
        mergeSortHelper(arr, 0, arr.length - 1);
        return arr;
    }

    private static void mergeSortHelper(int[] arr, int l, int r) {
        if (l >= r) return;

        int mid = l + ((r - l) >> 1);
        mergeSortHelper(arr, l , mid);
        mergeSortHelper(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int[] tmp = new int[r - l + 1];
        int i = l, j = mid + 1, k = 0;
        while (i <= mid && j <= r) {
            if (arr[i] <= arr[j]) {
                tmp[k++] = arr[i++];
            } else {
                cnt += (mid - i + 1);
                tmp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            tmp[k++] = arr[i++];
        }
        while (j <= r) {
            tmp[k++] = arr[j++];
        }
        for (int m = 0; m <= r - l; m++) {
            arr[l+m] = tmp[m];
        }
    }
}
