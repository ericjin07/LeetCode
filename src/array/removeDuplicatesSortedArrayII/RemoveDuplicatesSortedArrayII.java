package array.removeDuplicatesSortedArrayII;

public class RemoveDuplicatesSortedArrayII {

    public int removeDuplicates(int[] nums) {
        int index = 0;
        for (int n : nums) {
            if (index < 2 || nums[index - 2] != n) {
                nums[index++] = n;
            }
        }
        return index;
    }

    public int removeDuplicates_2(int[] nums) {
        if (nums.length < 2) return nums.length;

        int slow = 2, fast = 2;
        while (slow < nums.length && fast < nums.length) {
            if (nums[slow - 2] != nums[fast]) {
                nums[slow++] = nums[fast];
            }
            fast++;
        }
        return slow;
    }
}
