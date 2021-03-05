package sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = new int[] {3,2,65 ,1,4,2,7,4,98,12,78,5,65};
        System.out.println(Arrays.toString(quickSort(arr)));
    }

    public static int[] quickSort(int[] arr) {
        quickSortHelper(arr, 0, arr.length - 1);
        return arr;
    }

    private static void quickSortHelper(int[] arr, int l, int r) {
        if (l >= r) return;

        int pivot = partition(arr, l , r);
        quickSortHelper(arr, l, pivot - 1);
        quickSortHelper(arr, pivot + 1, r);
    }

    private static int partition(int[] arr, int l, int r) {
        int pivot = arr[r];
        int low = l;
        for (int i = l; i < r; i++) {
            if (arr[i] < pivot) {
                int tmp = arr[i];
                arr[i] = arr[low];
                arr[low++] = tmp;
            }
        }
        arr[r] = arr[low];
        arr[low] = pivot;
        return low;
    }
}
