package array.maxConsecutiveOnes;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 03/01/2019 2:42 PM
 */
public class MaxConsecutiveOnes {

    /**
     * 遇到 1 ++，遇到 0，取最大，归零。
     * 最后一位可能是1，可能是0，要重新取最大值
     * @param nums
     * @return
     */
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0,max = 0;
        for(int n : nums) {
            if (n == 1)
                cnt++;
            else {
                max = Math.max(max,cnt);
                cnt = 0;
            }
        }
        return Math.max(max,cnt);
    }
}
