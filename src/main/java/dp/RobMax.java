package dp;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by huzefa on 3/17/17.
 */
public class RobMax {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        Map<Integer, Integer> memo = new HashMap<>();
        return robMax(0, 0, nums, memo);
    }

    public int robMax(int sum, int i, int[] nums, Map<Integer, Integer> memo) {
        if (i >= nums.length) {
            return sum;
        }

        if (memo.containsKey(i)) {
            return memo.get(i);
        }

        memo.put(i, Math.max(robMax(sum, i + 1, nums, memo), robMax(sum + nums[i], i + 2, nums, memo)));
        return memo.get(i);
    }
}
