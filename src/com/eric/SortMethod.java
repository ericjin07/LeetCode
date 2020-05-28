package com.eric;

import java.util.Arrays;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 05/28/2020 5:01 PM
 */
public class SortMethod {

    public static void main(String[] args) {
        SortMethod method = new SortMethod();
        int[] arr = new int[] {3,2,1,5,4,6,7,9,8,0};
//        System.out.println(Arrays.toString(method.bubbleSort(arr)));
//        System.out.println(Arrays.toString(method.insertSort(arr)));
        System.out.println(Arrays.toString(method.selectSort(arr)));
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

}
