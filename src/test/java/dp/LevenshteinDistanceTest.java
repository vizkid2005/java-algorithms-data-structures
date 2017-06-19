package dp;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LevenshteinDistanceTest {

    @Test
    public void testDistance() {
        LevenshteinDistance ld = new LevenshteinDistance();
        Assert.assertEquals(ld.getDistance("saturday", "sundays"), 4);
        Assert.assertEquals(ld.getDistance("", ""), 0);
        Assert.assertEquals(ld.getDistance("", "abc"), 3);
        Assert.assertEquals(ld.getDistance("abc", ""), 3);
        Assert.assertEquals(ld.getDistance("", ""), 0);
    }
}
