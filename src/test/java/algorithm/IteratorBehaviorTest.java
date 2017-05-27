package algorithm;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by huzefa on 5/1/17.
 */
public class IteratorBehaviorTest {

    @Test
    public void testArrayListIterator() {
        List<Integer> list = new ArrayList<>();
        int i = 1;
        list.add(i);
        Iterator iter = list.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
            list.add(++i);
        }
    }
}
