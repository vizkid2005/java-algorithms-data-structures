package experiment;

import org.testng.annotations.Test;

/**
 * Created by huzefa on 5/29/17.
 */
public class CheckIterationTest {

    @Test
    public void testIteration() {
        CheckIteration checkIteration = new CheckIteration();
        checkIteration.verifySizeBehavior();
    }
}

