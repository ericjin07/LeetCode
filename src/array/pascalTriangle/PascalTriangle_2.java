package array.pascalTriangle;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 11/22/2018 9:27 AM
 */
public class PascalTriangle_2 {

    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> row;
        for (int i = 0; i < rowIndex + 1; i++){
            row = new ArrayList<>();
            for (int j = 0; j < i+1; j++){
                if (j == 0 || j == i) row.add(1);
                else row.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
            }
            result.add(row);
        }
        return result.get(rowIndex);
    }
}
