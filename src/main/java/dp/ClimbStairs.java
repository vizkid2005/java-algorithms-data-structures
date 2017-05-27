package dp;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by huzefa on 3/17/17.
 */
public class ClimbStairs {

    public int climbStairs(int n) {
        Map<String, Integer> memo = new HashMap<>();
        return climbSteps(0, n, memo);
    }

    public int climbSteps(int i, int remaining, Map<String, Integer> memo) {

        if (memo.containsKey(i + "/" + remaining)) {
            return memo.get(i + "/" + remaining);
        }

        if (remaining == 0) {
            memo.put(i + "/" + remaining, 1);
            return 1;
        } else if (remaining < 0) {
            memo.put(i + "/" + remaining, 0);
            return 0;
        }
        memo.put(i + "/" + remaining, climbSteps(i + 1, remaining - 1, memo) + climbSteps(i + 2, remaining - 2, memo));
        return memo.get(i + "/" + remaining);
    }
}
