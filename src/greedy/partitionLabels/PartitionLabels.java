package greedy.partitionLabels;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {

    public List<Integer> partitionLabels(String S) {
        int[] endPoints = new int[26];
        int len = S.length();
        for (int i = 0; i < len; i++) {
            endPoints[S.charAt(i) - 'a'] = i;
        }
        List<Integer> res = new ArrayList<>();
        int end = 0, start = 0;
        for (int i = 0; i < len; i++) {
            end = Math.max(end, endPoints[S.charAt(i) - 'a']);
            if (end == i) {
                res.add(end - start + 1);
                start = end + 1;
            }
        }
        return res;
    }
}
