package algorithm;


import org.testng.annotations.Test;

public class ZigZagTest {

    @Test
    public void testZigZag() {
        ZigZag z = new ZigZag();
        String ans = z.makePattern("PAYPALISHIRING", 3);
        System.out.println(ans);
    }
}
