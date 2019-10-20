package math.quickSort;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 08/13/2018 9:07
 */
public class QuickSort {

    public void quickSort(int arr[],int start,int end) {
        if (start >= end) return;
        int pivot = partition(arr,start,end);
        quickSort(arr,start,pivot-1);
        quickSort(arr,pivot+1,end);
    }

    private int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int left = start;
        int right = end;
        int index = start;
        while (left <= right) {
            while (left <= right) {
                if (pivot > arr[right]) {
                    arr[left] = arr[right];
                    index = right;
                    left++;
                    break;
                }
                right--;
            }
            while (left <= right) {
                if (pivot < arr[left]) {
                    arr[right] = arr[left];
                    index = left;
                    right--;
                    break;
                }
                left++;
            }
        }
        arr[index] = pivot;
        return index;

    }
}
