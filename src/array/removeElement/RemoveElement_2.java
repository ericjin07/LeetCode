package array.removeElement;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 02/12/2019 11:02 AM
 */
public class RemoveElement_2 {

    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        if (len == 0)
            return 0;
        int left = 0;
        for (int i = 0; i<len;i++) {
            if (nums[i] == val)
                continue;
            nums[left++] = nums[i];
        }
        return left;
    }
}
