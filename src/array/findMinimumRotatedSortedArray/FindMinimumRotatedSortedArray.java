package array.findMinimumRotatedSortedArray;

public class FindMinimumRotatedSortedArray {

    public int findMin(int[] nums) {
        if (nums.length == 1) return nums[0];
        int low = 0, high = nums.length - 1;
        int mid;
        while (low < high) {
            mid = low + ((high - low) >> 1);
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return nums[low];
    }
}
