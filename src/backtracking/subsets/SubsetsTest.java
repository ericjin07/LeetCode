package backtracking.subsets;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SubsetsTest {

    @Test
    public void subsets() {
        Subsets subsets = new Subsets();
        List<List<Integer>> lists = subsets.subsets(new int[]{1, 2, 3, 4});
        System.out.println(lists);
    }
}