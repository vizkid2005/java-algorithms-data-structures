package algorithm.comparator;

import java.util.Comparator;

/**
 * Comparator of Integers
 */

public class IntegerComparator implements Comparator<Integer> {

    public int compare(Integer o1, Integer o2) {
        return Integer.valueOf(o1) < Integer.valueOf(o2) ? -1 :
                Integer.valueOf(o1) > Integer.valueOf(o2) ? 1 :0;
    }
}
