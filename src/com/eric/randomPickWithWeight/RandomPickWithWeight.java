package com.eric.randomPickWithWeight;

import java.util.Arrays;
import java.util.Random;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 06/05/2020 9:57 PM
 */
public class RandomPickWithWeight {

    public static void main(String[] args) {
        int[] w = new int[] {2,3,5};
        Solution solution = new Solution(w);
        System.out.println(Arrays.toString(solution.sum));
        int wi = solution.rand.nextInt(solution.sum[solution.sum.length - 1]) + 1;
        System.out.println("wi=" + wi);
        System.out.println(solution.pickIndex());
    }

    static class Solution {

        int[] sum;
        Random rand;
        public Solution(int[] w) {
            sum = Arrays.copyOf(w, w.length);
            for (int i = 1; i < sum.length; i++) {
                sum[i] += sum[i-1];
            }
            rand = new Random();
        }

        public int pickIndex() {
            int wi = rand.nextInt(sum[sum.length - 1]) + 1;
            int low = 0, high = sum.length - 1;
            while (low <= high) {
                int mid = low + ((high - low) >> 1);
                if (sum[mid] == wi) return mid;
                else if (sum[mid] < wi) low = mid + 1;
                else high = mid - 1;
            }
            return low;
        }
    }
}
