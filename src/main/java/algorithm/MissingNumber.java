package algorithm;

/**
 * Created by huzefa on 3/13/17.
 */
public class MissingNumber {

    public int missingNumber(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }
        boolean flag = true;
        int visits = 0;

        int i = 0;
        while (flag) {
            if (visits >= nums.length) {
                break;
            }
            if (i == nums.length) {
                i = 0;
                visits += 1;
            }
            if (nums[i] == -1 && i < nums.length - 1) {
                i = i + 1;
            }
            int value = nums[i];
            nums[i] = -1;
            visits += 1;
            i = value;
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == -1) {
                continue;
            }
            return j;
        }
        return 1;
    }
}
