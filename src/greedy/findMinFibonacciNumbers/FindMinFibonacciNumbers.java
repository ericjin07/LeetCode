package greedy.findMinFibonacciNumbers;

import java.util.ArrayList;

public class FindMinFibonacciNumbers {

    public int findMinFibonacciNumbers(int k) {
        if (k == 1) {
            return 1;
        }
        ArrayList<Integer> fib = new ArrayList<Integer>();
        fib.add(1);
        fib.add(1);
        int a = 1, b = 1;
        while (b < k) {
            int cur = a + b;
            if (cur == k) {
                return 1;
            }
            a = b;
            b = cur;
            fib.add(cur);
        }
        int res = 0;
        int idx = fib.size() - 1;
        while (k > 0) {
            while (idx >= 0 && fib.get(idx) > k) {
                idx--;
            }
            res++;
            k -= fib.get(idx);
        }
        return res;
    }
}
