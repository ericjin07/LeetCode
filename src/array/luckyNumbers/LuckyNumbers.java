package array.luckyNumbers;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbers {

    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int idx = 0;
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][idx] > matrix[i][j]) {
                    idx = j;
                }
            }
            int num = matrix[i][idx];
            boolean isMax = true;
            // i, j is the minimum number of this row
            for (int k = 0; k < matrix.length && isMax; k++) {
                if (num < matrix[k][idx]) {
                    isMax = false;
                }
            }
            if (isMax) {
                res.add(num);
            }
        }
        return res;
    }
}
