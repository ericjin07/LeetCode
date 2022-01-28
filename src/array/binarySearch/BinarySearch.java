package array.binarySearch;

public class BinarySearch {

    public int search(int[] nums, int target) {
        int mid;
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            mid = l + ((r - l) >> 1);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }
}
