package math.simplifiedFractions;

import java.util.ArrayList;
import java.util.List;

public class SimplifiedFractions {

    public List<String> simplifiedFractions(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                if (gcd(i, j) == 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(j).append('/').append(i);
                    list.add(sb.toString());
                }
            }
        }
        return list;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
