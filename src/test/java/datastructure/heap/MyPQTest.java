package datastructure.heap;

import org.testng.annotations.Test;

/**
 * Created by huzefa on 4/16/17.
 */
public class MyPQTest {

    @Test
    public void testMyPQ() {
        MyPQ pq = new MyPQ(10);
        pq.insert(3);
        pq.show();
        pq.insert(4);
        pq.show();
        pq.insert(5);
        pq.show();
        pq.insert(100);
        pq.show();
        pq.insert(10);
        pq.show();
        pq.insert(49);
        pq.show();
        pq.insert(90);
        pq.show();
        pq.insert(6);
        pq.show();
        pq.insert(7);
        pq.show();
        pq.insert(9);
        pq.show();

        pq.delete();
        pq.show();
        pq.delete();
        pq.show();
    }
}
