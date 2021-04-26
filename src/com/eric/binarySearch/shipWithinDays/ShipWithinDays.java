package com.eric.binarySearch.shipWithinDays;

import java.util.Arrays;

public class ShipWithinDays {

    public int shipWithinDays(int[] weights, int D) {
        int left = Arrays.stream(weights).max().getAsInt(), right = Arrays.stream(weights).sum();
        while (left < right) {
            int mid = left + ((right - left) >> 1); //mid of the capacity
            int need = 1, cur = 0; // need for the day, cur is today's weight
            for (int weight : weights) {
                if (cur + weight > mid) {
                    need++;
                    cur = 0; // the next day
                }
                cur += weight;
            }
            // all package over, check the need day and the given D
            if (need <= D) {// don't need D day, it means mid capacity is large, we can regard the large
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
