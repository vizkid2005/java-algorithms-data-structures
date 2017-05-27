package algorithm;

/**
 * Created by huzefa on 4/29/17.
 */

public class AddTwo {

    public ListNode addTwo(ListNode l1, ListNode l2) {
        int carry = 0;

        ListNode head = null;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
            carry = sum / 10;
            ListNode digit = new ListNode(sum % 10);
            if (head == null) {
                head = digit;
            } else {
                digit.next = head;
                head = digit;
            }

            l1 = (l1 == null) ? l1 : l1.next;
            l2 = (l2 == null) ? l2 : l2.next;
        }

        return head;
    }
}

class ListNode {

    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        next = null;
    }
}