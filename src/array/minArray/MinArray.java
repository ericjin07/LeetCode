package array.minArray;

public class MinArray {

    public int minArray(int[] numbers) {
        int len = numbers.length;
        int lo = 0, hi = len - 1;;
        while (lo < hi) {
            int mid = lo + ((hi - lo) >> 1);
            if (numbers[mid] > numbers[hi]) {
                lo = mid + 1;
            } else if (numbers[mid] < numbers[hi]) {
                hi = mid;
            } else {
                hi -= 1;
            }
        }
        return numbers[lo];
    }
}
