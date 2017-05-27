package algorithm;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseWordsTest {

    @Test
    public void testReverseWords() {
        ReverseWords r = new ReverseWords();
        Assert.assertTrue(r.reverseWords("madam i am adam").equals("adam am i madam"));
        Assert.assertTrue(r.reverseWords("madam").equals("madam"));
        Assert.assertTrue(r.reverseWords("").equals(""));
        Assert.assertTrue(r.reverseWords("i").equals("i"));
        Assert.assertTrue(r.reverseWords("   a   b ").equals("i"));

    }

}
