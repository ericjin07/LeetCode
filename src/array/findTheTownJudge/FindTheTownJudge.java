package array.findTheTownJudge;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 05/10/2020 7:20 PM
 */
public class FindTheTownJudge {

    public int findJudge(int N, int[][] trust) {
        int[] arr = new int[N+1];
        int len = trust.length;
        for (int[] ints : trust) {
            arr[ints[0]] = -1;
            if (arr[ints[1]] != -1) arr[ints[1]]++;
        }
        for (int i = 1; i < N + 1; i++) {
            if (arr[i] == N - 1) return i;
        }
        return -1;
    }
}
