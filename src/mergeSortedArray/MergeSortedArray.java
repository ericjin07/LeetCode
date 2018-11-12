package mergeSortedArray;

import java.util.Arrays;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 11/12/2018 9:27 AM
 */
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mIndex,nIndex,tmp;
        nIndex = mIndex = 0;
        if (n == 0){
            System.out.println(Arrays.toString(nums1));
            return;
        }
        while ((nIndex < n) && (mIndex < m)){
            if (nums1[mIndex] <= nums2[nIndex])
                mIndex++;
            else {
                tmp = nums1[mIndex];
                nums1[mIndex] = nums2[nIndex];
                nums2[nIndex] = tmp;
                sort(nums2,n);
            }
        }
        while(nIndex < n)
            nums1[mIndex++] = nums2[nIndex++];
        System.out.println(Arrays.toString(nums1));
    }

    private void sort(int[] arr,int n) {
        int tmp;
        for(int i = 0; i < n-1; i++){
            if (arr[i] > arr[i+1]){
                tmp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = tmp;
            }
        }
    }

    //另一种巧思，因为是排序的，而且num1有多余的空间，所以从大的开始排序，直接占用最后的空位即可
    public void merge_addBig(int[] nums1, int m, int[] nums2, int n){
        int i,j,k;
        i = m - 1;
        j = n - 1;
        k = nums1.length - 1;
        while (i >= 0 && j >= 0){
            if (nums1[i] > nums2[j])
                nums1[k--] = nums1[i--];
            else
                nums1[k--] = nums2[j--];
        }
        while (j >= 0)
            nums1[k--] = nums2[j--];
        System.out.println(Arrays.toString(nums1));
    }
}
