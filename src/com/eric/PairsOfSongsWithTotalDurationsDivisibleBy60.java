package com.eric;
//In a list of songs, the i-th song has a duration of time[i] seconds. 
//
// Return the number of pairs of songs for which their total duration in seconds is divisible by 60. Formally, we want the number of indices i < j with (time[i] + time[j]) % 60 == 0. 
//
// 
//
// Example 1: 
//
// 
//Input: [30,20,150,100,40]
//Output: 3
//Explanation: Three pairs have a total duration divisible by 60:
//(time[0] = 30, time[2] = 150): total duration 180
//(time[1] = 20, time[3] = 100): total duration 120
//(time[1] = 20, time[4] = 40): total duration 60
// 
//
// 
// Example 2: 
//
// 
//Input: [60,60,60]
//Output: 3
//Explanation: All three pairs have a total duration of 120, which is divisible by 60.
// 
// 
//
// 
//
// Note: 
//
// 
// 1 <= time.length <= 60000 
// 1 <= time[i] <= 500 
// Related Topics Array

import java.util.HashMap;
import java.util.Map;

public class PairsOfSongsWithTotalDurationsDivisibleBy60{
    public static void main(String[] args) {
        Solution solution = new PairsOfSongsWithTotalDurationsDivisibleBy60().new Solution();
        int [] time = new int[]{30,20,150,100,40};
        int i = solution.numPairsDivisibleBy60(time);
        System.out.println(i);
        System.out.println(120 % 60);
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int t : time) {
            int d = (60 - t % 60) % 60;
            res += map.getOrDefault(d, 0);
            map.compute(t % 60, (k,v) -> v == null ? 1 : ++v);
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}