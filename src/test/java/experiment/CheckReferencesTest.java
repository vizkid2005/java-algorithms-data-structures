package experiment;

import org.testng.annotations.Test;

/**
 * Created by huzefa on 5/29/17.
 */
public class CheckReferencesTest {

    @Test
    public void testReferences() {
        CheckReferences c = new CheckReferences();
        c.modifyAndCheck();
    }
}
