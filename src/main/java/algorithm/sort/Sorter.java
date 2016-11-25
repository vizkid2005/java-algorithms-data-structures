package algorithm.sort;

import java.util.Comparator;

/**
 * This interface uses generics to allow sorting of any type of data with use of its comparator.
 */
public interface Sorter<E> {

    E[] sort(E[] array, Comparator comparator, int start, int end);
}
