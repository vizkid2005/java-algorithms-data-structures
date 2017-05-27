package algorithm;

/**
 * Created by huzefa on 5/3/17.
 */
public class CopyRandomList {

    public RandomListNode deepCopy(RandomListNode head) {
        if (head == null) {
            return null;
        }
        RandomListNode dummy = head;
        RandomListNode current = head;
        while (current != null) {
            RandomListNode r = new RandomListNode(current.label);
            RandomListNode next = current.next;
            current.next = r;
            r.next = next;
            current = next;
        }

        current = dummy;

        while (current != null) {
            RandomListNode newL = current.next;
            newL.random = current.random.next;
            current = current.next.next;
        }

        RandomListNode result = new RandomListNode(0);
        current = dummy;
        RandomListNode copy, copyIter = result;
        while (current != null) {

        }

        return result;
    }

    public class RandomListNode {

        RandomListNode next;
        RandomListNode random;
        int label;

        RandomListNode(int label) {
            this.label = label;
        }
    }
}
