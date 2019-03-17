package array.canPlaceFlowers;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 03/13/2019 10:30 AM
 */

/**
 * Suppose you have a long flowerbed in which some of the plots are planted and some are not.
 * However, flowers cannot be planted in adjacent plots - they would compete for water and both would die.
 *
 * Given a flowerbed (represented as an array containing 0 and 1, where 0 means empty and 1 means not empty),
 * and a number n, return if n new flowers can be planted in it without violating the no-adjacent-flowers rule.
 *
 * Example 1:
 * Input: flowerbed = [1,0,0,0,1], n = 1
 * Output: True
 * Example 2:
 * Input: flowerbed = [1,0,0,0,1], n = 2
 * Output: False
 * Note:
 * The input array won't violate no-adjacent-flowers rule.
 * The input array size is in the range of [1, 20000].
 * n is a non-negative integer which won't exceed the input array size.
 */
public class CanPlaceFlowers {

    /**
     * 思路：最左最右不用校验0，所以最开始把zeroCnt设为1，当作左边已为0
     * @param flowerbed
     * @param n
     * @return
     */
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int zeroCnt = 1;    //把左边当作0
        int nFlow = 0;
        boolean bound = true;
        for (int i = 0; i < len; i++) {
            if (flowerbed[i] == 0) zeroCnt++;
            else {
                nFlow += (zeroCnt-1)/2;
                zeroCnt = 0;
            }
        }
        //右边为0
        if (zeroCnt != 0) nFlow += zeroCnt/2;
        return nFlow >= n;
    }

    /**
     * 遍历数组，校验当前元素，前一个（如果自己是第一个就不用校验）是否为零，后一个（如果自己是最后一个就不用校验）是否为零。
     * 如果是零，就填坑为1。
     * @param flowerbed
     * @param n
     * @return
     */
    public boolean canPlaceFlowers_while(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int i=0;
        int result = 0;
        while (i < len) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0) && (i == len - 1 || flowerbed[i+1] == 0)) {
                result++;
                flowerbed[i] = 1;
            }
            i++;
        }
        return result >= n;
    }


}
