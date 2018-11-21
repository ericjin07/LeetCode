package array.mergeSortedArray;

import org.junit.Test;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 11/12/2018 9:43 AM
 */
public class MergeSortedArrayTest {

    @Test
    public void merge() {
        int nums1[] = {1,2,7,0,0,0};
        int nums2[] = {2,5,6};
        int n,m;
        n = m = 3;
        MergeSortedArray solution = new MergeSortedArray();
//        solution.merge(nums1,m,nums2,n);
        solution.merge_addBig(nums1,m,nums2,n);
    }
}