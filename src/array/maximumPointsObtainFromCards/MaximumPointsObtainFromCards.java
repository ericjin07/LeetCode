package array.maximumPointsObtainFromCards;

import java.util.Arrays;

public class MaximumPointsObtainFromCards {

    public int maxScore(int[] cardPoints, int k) {
        int result = 0;
        int len = cardPoints.length;
        // get the left len - k card sum
        for (int i = 0; i < len -  k; i++) {
            result += cardPoints[i];
        }
        // slide the window, and keep the minimum value
        int min = result;
        for (int i = len - k; i < len; i++) {
            result += cardPoints[i] - cardPoints[i - len + k];
            min = Math.min(min, result);
        }
        return Arrays.stream(cardPoints).sum() - min;
    }
}
