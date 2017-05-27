package algorithm;

import org.testng.annotations.Test;

/**
 * Created by huzefa on 3/13/17.
 */
public class MissingNumberTest {

    @Test
    public void testMisisngNumber() {
        MissingNumber mn = new MissingNumber();
        int[] numbers = {2, 1};
        mn.missingNumber(numbers);
    }

}
