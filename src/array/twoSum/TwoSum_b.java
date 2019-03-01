package array.twoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * Create by IntelliJ IDEA.
 * Author: EricJin
 * Date: 02/12/2019 10:10 AM
 */
public class TwoSum_b {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int len = nums.length;
        for (int i=0;i <len;i++){
            if(map.containsKey(target-nums[i]))
                return new int[]{map.get(target-nums[i]),i};
            map.put(nums[i],i);
        }
        throw new RuntimeException("no solution found");
    }


    public int[] twoSum_2(int[] nums, int target) {
        int len = nums.length;
        for (int i = 0; i<len - 1; i++){
            for (int j = i+1; j<len; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[]{i,j};
            }
        }
        throw  new RuntimeException("no solution found");
    }
}
