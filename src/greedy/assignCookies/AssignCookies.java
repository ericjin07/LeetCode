package greedy.assignCookies;

import java.util.Arrays;

public class AssignCookies {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int numOfChild = g.length, numOfCookies = s.length;
        int count = 0;
        for (int j = 0; count < numOfChild && j < numOfCookies; j++) {
            while (j < numOfCookies && g[count] > s[j]) {
                j++;
            }
            if (j < numOfCookies) {
                count++;
            }
        }
        return count;
    }
}
