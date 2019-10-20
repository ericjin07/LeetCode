package array.fibonacciNumber;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 03/01/2019 3:00 PM
 */
public class FibonacciNumber {

    /**
     * 运用递归的方法，后一个数等于前两个数的和
     * 边界条件就是最开始两个数0 和 1
     * @param N
     * @return
     */
    public int fib(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return fib(N-2) + fib(N-1);
    }

    public int fib_arr(int N) {
        if (N < 0) return -1;
        if (N == 0) return 0;
        if (N == 1) return 1;
        int[] arr = new int[N+1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < N + 1; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[N];
    }


}
