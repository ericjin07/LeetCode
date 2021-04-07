package array.searchRotatedSortedArrayII;

public class SearchRotatedSortedArrayII {

    public boolean search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return false;
        if (nums.length == 1) return nums[0] == target;

        int low = 0, high = nums.length - 1;
        int mid;
        while (low <= high) {
           mid = low + ((high - low) >> 1);
           if (nums[mid] == target) return true;

           if (nums[low] == nums[mid]) {
               low++;
               continue;
           }
           if (nums[low] < nums[mid]) {
               //前半部有序，搜
               if (target < nums[mid] && target >= nums[low]) {
                   high = mid - 1;
               } else {
                   low = mid + 1;
               }
           } else {
               if (target > nums[mid] && target <= nums[high]) {
                   low = mid + 1;
               } else {
                   high = mid - 1;
               }
           }
        }
        return false;
    }
}
