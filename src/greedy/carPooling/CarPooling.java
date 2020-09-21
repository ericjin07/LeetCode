package greedy.carPooling;

import java.util.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 09/21/2020 8:17 PM
 */
public class CarPooling {

    public boolean carPooling(int[][] trips, int capacity) {
        Map<Integer, Integer> map = new TreeMap<>();
        for(int[] trip : trips) {
            //add the start location of the passenger
            map.put(trip[1], map.getOrDefault(trip[1], 0) + trip[0]);
            //subtract
            map.put(trip[2], map.getOrDefault(trip[2], 0) - trip[0]);
        }
        for(int person : map.values()) {
            capacity -= person;
            if (capacity < 0) {
                return false;
            }
        }
        return true;
    }

    //busort
    // because 0 <= trips[i][1] < trips[i][2] <= 1000
    public boolean carPooling_bucket_sort (int[][] trips, int capacity) {
        int[] stamp = new int[1001];
        for (int[] trip : trips) {
            stamp[trip[1]] += trip[0];
            stamp[trip[2]] -= trip[0];
        }

        for (int i = 0; i < 1001; i++) {
            capacity -= stamp[i];
            if (capacity < 0) return false;
        }
        return true;
    }
}