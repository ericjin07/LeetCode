package array.queueReconstructionbyHeight;

import java.util.*;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 06/07/2020 12:52 PM
 *
 * Suppose you have a random list of people standing in a queue. Each person is described by a pair of integers (h, k), where h is the height of the person and k is the number of people in front of this person who have a height greater than or equal to h. Write an algorithm to reconstruct the queue.
 *
 * Note:
 * The number of people is less than 1,100.
 *
 *
 * Example
 *
 * Input:
 * [[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
 *
 * Output:
 * [[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
 */
public class QueueReconstructionByHeight {

    public static void main(String[] args) {
        QueueReconstructionByHeight height = new QueueReconstructionByHeight();
        int[][] people = new int[][] {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
        System.out.println(Arrays.deepToString(height.reconstructQueue(people)));
    }

    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (o1, o2) -> {
            if (o1[0] != o2[0]) return o2[0] - o1[0];
            return o1[1] - o2[1];
        });
        List<int[]> list = new ArrayList<>();
        for (int[] person : people) {
            list.add(person[1], person);
        }
        return list.toArray(new int[people.length][]);
    }

}
