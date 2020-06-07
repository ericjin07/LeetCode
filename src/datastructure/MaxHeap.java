package datastructure;

import java.util.Arrays;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 06/06/2020 9:23 PM
 */
public class MaxHeap {

    int[] maxHeap;
    int n;

    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap();
        int[] a = new int[] {0,1,2,3,4,5,6,7,8,9,10};
        heap.buildMaxHeap(a, a.length);
        System.out.println(Arrays.toString(a));
        heap.printHeap();
        System.out.println(heap.max());
        System.out.println(heap.extraMax());
        heap.printHeap();

        System.out.println(heap.extraMax());
        heap.printHeap();

        System.out.println(heap.extraMax());
        heap.printHeap();
    }

    public void printHeap() {
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            if (i == n - 1) System.out.print(maxHeap[i]);
            else System.out.print(maxHeap[i] + ",");
        }
        System.out.println("]");
    }

    // To make a to become a Max heap
    public int[] buildMaxHeap(int[] a, int n) {
        // We can discard the leaf node, because They're all the max heap(small heap).
        // Then we can build the heap from button to head, from the log(n) - 1 height to 1
        // And the n/2 >> n + 1 is the leaf.
        // So we loop the n/2 - 1 down to the 0 index
        maxHeap = Arrays.copyOf(a, n);
        for (int i = (n/2) - 1; i >=0 ; i--) {
            heapify(maxHeap, n, i);
        }
        this.n = n;
        return maxHeap;
    }

    private void heapify(int[] a, int n, int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        // compare the parent and left and right, find the max
        int largeIdx = i;
        if (left < n && a[left] > a[largeIdx]) largeIdx = left;
        if (right < n && a[right] > a[largeIdx]) largeIdx = right;
        // if the largeIdx is not the parent node, then, swap the two value and heapify the swap one recursion
        if (largeIdx != i) {
            int tmp = a[i];
            a[i] = a[largeIdx];
            a[largeIdx] = tmp;
            heapify(a, n, largeIdx);
        }
    }

    public int max() {
        return maxHeap[0];
    }

    public int extraMax() {
        // move the max to the last one
        // heapify the root
        // return the max one
        if (maxHeap == null || n == 0) return -1;
        int max = maxHeap[0];
        maxHeap[0] = maxHeap[n-1];
        maxHeap[n-1] = max;
        heapify(maxHeap, n, 0);
        n--;
        return max;
    }
}
