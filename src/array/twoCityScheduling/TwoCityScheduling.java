package array.twoCityScheduling;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 06/03/2020 9:34 PM
 *
 * There are 2N people a company is planning to interview. The cost of flying the i-th person to city A is costs[i][0], and the cost of flying the i-th person to city B is costs[i][1].
 *
 * Return the minimum cost to fly every person to a city such that exactly N people arrive in each city.
 *
 *
 *
 * Example 1:
 *
 * Input: [[10,20],[30,200],[400,50],[30,20]]
 * Output: 110
 * Explanation:
 * The first person goes to city A for a cost of 10.
 * The second person goes to city A for a cost of 30.
 * The third person goes to city B for a cost of 50.
 * The fourth person goes to city B for a cost of 20.
 *
 * The total minimum cost is 10 + 30 + 50 + 20 = 110 to have half the people interviewing in each city.
 *
 *
 * Note:
 *
 * 1 <= costs.length <= 100
 * It is guaranteed that costs.length is even.
 * 1 <= costs[i][0], costs[i][1] <= 1000
 */
public class TwoCityScheduling {

    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                int v1 = o1[1] - o1[0];
                int v2 = o2[1] - o2[0];
                return v1 - v2;
            }
        });
        int sum = 0;
        // if we change a person to B city, the cost will change as (costs[1] - costs[0]).
        // so we need sort the costs by the costs[1] - costs[0], and make the small half to the B city, it will be the small cost as total
        for (int i = 0; i < costs.length; i++) {
            // to B city
            if (i + 1 <= (costs.length / 2)) {
                sum += costs[i][1];
            } else {
                sum += costs[i][0];
            }
        }
        return sum;
    }
}
