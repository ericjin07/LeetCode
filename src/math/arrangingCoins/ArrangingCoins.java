package math.arrangingCoins;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 07/01/2020 5:16 PM
 */
public class ArrangingCoins {

    public static void main(String[] args) {
        ArrangingCoins arrangingCoins = new ArrangingCoins();
        System.out.println(arrangingCoins.arrangeCoins(1804289383));
    }

    public int arrangeCoins(int n) {
        int low = 0;
        int high = n;
        long mid;
        while (low <= high) {
            mid = low + ((high - low) >> 1);
            long sum = (mid * (mid + 1)) >> 1;
            if (sum == n) return (int) mid;
            else if (sum < n) low = (int)mid + 1;
            else high = (int)mid - 1;
        }
        return high;
    }
}
