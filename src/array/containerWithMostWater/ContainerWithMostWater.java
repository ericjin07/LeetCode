package array.containerWithMostWater;

/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */
class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int len = height.length;
        int maxArea = 0;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 1; j < len; j++) {
                maxArea = Math.max(maxArea, (j - i) * Math.min(height[i], height[j]));
            }
        }
        return maxArea;
    }

    /**
     * 从左右开始, 面积现在有了最大边长. 蓄水面积由最短的高决定,所以当一条高小,就往一边移动. 最后找到最大面积
     * @param height
     * @return
     */
    public int maxArea_twoPoint(int[] height) {
        int len = height.length;
        int maxArea = 0;
        int start = 0, end = len - 1;
        while (start < end) {
            maxArea = Math.max(maxArea, (end - start) * Math.min(height[start], height[end]));
            if (height[start] <= height[end]) start++;
            else end--;
        }
        return maxArea;
    }

}
