package array.checkStraightLine;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 05/08/2020 5:22 PM
 *
 * You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point.
 * Check if these points make a straight line in the XY plane.
 */
public class CheckStraightLine {

    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length == 2) return true;
        int xDelta = coordinates[1][0] - coordinates[0][0], yDelta = coordinates[1][1] - coordinates[0][1];
        for (int i = 2; i < coordinates.length - 1; i++) {
            int x = coordinates[i][0] - coordinates[0][0];
            int y = coordinates[i][1] - coordinates[0][1];
           if (x * yDelta != y * xDelta) return false;
        }
        return true;
    }
}
