package greedy.candy;

import java.util.Arrays;

public class Candy {

    /*
    1. init the all child to be 1 candy
    2. loop from left to right, if right large than left, update right candy to left plus 1
    3. loop from right to left, if left is large than right, and left's candy is less than right,
        update left's candy to right plus 1
     */
    public int candy(int[] ratings) {
        int len = ratings.length;
        int[] candies = new int[len];
        for (int i = 0; i < len; i++) {
            candies[i] = 1;
        }

        for (int i = 0; i < len - 1; i++) {
            if (ratings[i + 1] > ratings[i]) {
                candies[i + 1] = candies[i] + 1;
            }
        }

        for (int i = len - 1; i > 0; i--) {
            if (ratings[i - 1] > ratings[i] && candies[i - 1] <= candies[i]) {
                candies[i - 1] = candies[i] + 1;
            }
        }
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += candies[i];
        }
        return sum;
    }
}
