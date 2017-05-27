package algorithm;

import org.testng.annotations.Test;

public class AddTwoTest {

    @Test
    public void testAddTwo() {
        ListNode one = new ListNode(4);
        ListNode two = new ListNode(5);
        two.next = one;

        ListNode three = new ListNode(7);

        AddTwo addTwo = new AddTwo();
        ListNode ans = addTwo.addTwo(two, three);
        while (ans != null) {
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
}
