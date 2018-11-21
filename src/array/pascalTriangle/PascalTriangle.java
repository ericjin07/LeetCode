package array.pascalTriangle;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 11/21/2018 4:59 PM
 */
public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>(numRows);
        List<Integer> row;
        for (int i = 0; i < numRows; i++){
            row = new ArrayList<>(i+1);
            for (int j = 0; j < i+1; j++){
                if (j == 0 || j == i) row.add(1);
                else row.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
            }
            result.add(row);
        }
        return result;
    }
}
