package array.floodFill;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 05/11/2020 8:59 PM
 *
 * An image is represented by a 2-D array of integers, each integer representing the pixel value of the image (from 0 to 65535).
 *
 * Given a coordinate (sr, sc) representing the starting pixel (row and column) of the flood fill, and a pixel value newColor, "flood fill" the image.
 *
 * To perform a "flood fill", consider the starting pixel,
 * plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel,
 * plus any pixels connected 4-directionally to those pixels (also with the same color as the starting pixel), and so on.
 * Replace the color of all of the aforementioned pixels with the newColor.
 *
 * At the end, return the modified image.
 *
 * Example 1:
 * Input:
 * image = [[1,1,1],[1,1,0],[1,0,1]]
 * sr = 1, sc = 1, newColor = 2
 * Output: [[2,2,2],[2,2,0],[2,0,1]]
 * Explanation:
 * From the center of the image (with position (sr, sc) = (1, 1)), all pixels connected
 * by a path of the same color as the starting pixel are colored with the new color.
 * Note the bottom corner is not colored 2, because it is not 4-directionally connected
 * to the starting pixel.
 * Note:
 *
 * The length of image and image[0] will be in the range [1, 50].
 * The given starting pixel will satisfy 0 <= sr < image.length and 0 <= sc < image[0].length.
 * The value of each color in image[i][j] and newColor will be an integer in [0, 65535].
 */
public class FloodFill {

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        if (oldColor != newColor) {
            image[sr][sc] = newColor;
            if (sr - 1 >= 0 && image[sr - 1][sc] == oldColor) floodFill(image, sr - 1, sc, newColor);
            if (sc - 1 >= 0 && image[sr][sc - 1] == oldColor) floodFill(image, sr, sc - 1, newColor);
            if (sr < image.length - 1 && image[sr + 1][sc] == oldColor) floodFill(image, sr + 1, sc, newColor);
            if (sc < image[0].length - 1 && image[sr][sc + 1] == oldColor) floodFill(image, sr, sc + 1, newColor);
        }
        return image;
    }

    public int[][] floodFill_bfs(int[][] image, int sr, int sc, int newColor) {
        int [] xDlt = {1,0,0,-1}, yDlt = {0,1,-1,0};
        int oldColor = image[sr][sc];
        if (oldColor == newColor) {
            return image;
        }
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{sr, sc});
        image[sr][sc] = newColor;
        int col = image.length, row = image[0].length;
        while (!queue.isEmpty()) {
            int[] point = queue.poll();
            for (int i = 0; i < 4; i++) {
                int x = point[0] + xDlt[i], y = point[1] + yDlt[i];
                if (x >= 0 && x < col && y >= 0 && y < row && image[x][y] == oldColor) {
                    queue.offer(new int[] {x, y});
                    image[x][y] = newColor;
                }
            }
        }
        return image;
    }

    int [] xDlt = {1,0,0,-1}, yDlt = {0,1,-1,0};
    public int[][] floodFill_dfs(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        if (oldColor != newColor) {
            dfs(image, sr, sc, oldColor, newColor);
        }
        return image;
    }

    private void dfs(int[][] image, int sr, int sc, int oldColor, int newColor) {
        if (image[sr][sc] == oldColor) {
            image[sr][sc] = newColor;
            for (int i = 0; i < 4; i++) {
                int x = sr + xDlt[i], y = sc + yDlt[i];
                if (x >= 0 && x < image.length && y >= 0 && y < image[0].length && image[x][y] == oldColor) {
                    dfs(image, x, y, oldColor, newColor);
                }
            }
        }
    }
}
