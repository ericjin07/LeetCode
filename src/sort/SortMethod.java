package sort;

import java.util.Arrays;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 05/28/2020 5:01 PM
 */
public class SortMethod {

    public static void main(String[] args) {
        SortMethod method = new SortMethod();
        int[] arr = new int[] {3,2,1,5,4,6,7,9,8,0,12,10,11,88,67,34,54,77,56,32,100};
//        System.out.println(Arrays.toString(method.bubbleSort(arr)));
//        System.out.println(Arrays.toString(method.insertSort(arr)));
//        System.out.println(Arrays.toString(method.selectSort(arr)));
//        System.out.println(Arrays.toString(method.mergeSort(arr)));
        System.out.println(Arrays.toString(method.quickSort(arr)));
    }

    public int[] bubbleSort(int[] arr) {
        if (arr == null || arr.length <= 1) return arr;
        int len = arr.length;
        for (int j = len - 1; j >= 0; j--) {
            boolean flag = false;
            for (int i = 0; i < j; i++) {
                if (arr[i] > arr[i+1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                    flag = true;
                }
            }
            if (!flag) break;
        }
        return arr;
    }

    public int[] insertSort(int[] arr) {
        if (arr == null || arr.length <= 1) return arr;
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            int value = arr[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (arr[j] > value) {
                    arr[j+1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j+1] = value;
        }
        return arr;
    }

    public int[] selectSort(int[] arr) {
        if (arr == null || arr.length <= 1) return arr;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int min = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[min] > arr[j]) min = j;
            }
            if (min != i) {
                int tmp = arr[i];
                arr[i] = arr[min];
                arr[min] = tmp;
            }
        }
        return arr;
    }

    // 归并排序
    public int[] mergeSort(int[] arr) {
        mergeSortHelper(arr, 0, arr.length - 1);
        return arr;
    }

    private void mergeSortHelper(int[] arr, int lo, int hi) {
        // end point
        if (lo >= hi) return;
        int mid = (lo + hi) / 2;
        // break into small problem
        mergeSortHelper(arr, lo, mid);
        mergeSortHelper(arr, mid + 1, hi);
        // merge the two sorted into origin
        int[] tmp = new int[hi - lo + 1];
        int p1 = lo, p2 = mid + 1, i = 0;
        while (p1 <= mid && p2 <= hi) {
            if (arr[p1] <= arr[p2]) {
                tmp[i++] = arr[p1++];
            } else {
                tmp[i++] = arr[p2++];
            }
        }
        for (; p1 <= mid && i < tmp.length; i++) {
            tmp[i] = arr[p1++];
        }
        for (; p2 <= hi && i < tmp.length; i++) {
            tmp[i] = arr[p2++];
        }
        for (int j = lo, k = 0; j <= hi; j++, k++) {
            arr[j] = tmp[k];
        }
    }

    //快速排序
    public int[] quickSort(int[] arr) {
        quickSortHelper(arr, 0, arr.length - 1);
        return arr;
    }

    private void quickSortHelper(int[] arr, int lo, int hi) {
        if (lo >= hi) return;
        int pivot = partition(arr, lo, hi);

        quickSortHelper(arr, lo, pivot - 1);
        quickSortHelper(arr, pivot + 1, hi);
    }

    private int partition(int[] arr, int lo, int hi) {
        int pivot = arr[hi];
        int i = lo;
        for (int j = lo; j < hi; j++) {
            if (arr[j] < pivot) {
                int tmp = arr[j];
                arr[j] = arr[i];
                arr[i++] = tmp;
            }
        }
        int tmp = arr[i];
        arr[i] = pivot;
        arr[hi] = tmp;
        return i;
    }

}
