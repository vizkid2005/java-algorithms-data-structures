package dp;

import org.testng.annotations.Test;

/**
 * Created by huzefa on 3/18/17.
 */
public class RobMaxTest {

    @Test
    public void testRobmax() {
        RobMax robMax = new RobMax();
        int[] n = {1, 2, 1, 1};
        System.out.println(robMax.rob(n));
    }
}
