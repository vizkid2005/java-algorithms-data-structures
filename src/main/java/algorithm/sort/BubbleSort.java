package algorithm.sort;

import util.CommonUtil;

import java.util.Comparator;

/**
 * Implementation of BubbleSort
 */

public class BubbleSort<E> implements Sorter<E> {

    CommonUtil commonUtil;
    BubbleSort() {
        commonUtil = new CommonUtil();
    }
    public E[] sort(E[] array, Comparator comparator, int start, int end) {

        int n = array.length;
        // Can be optimized further but the complexity will still be O(n^2)
        // Use QuickSort or MergeSort instead
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {

                //Swap if array[j] > array[j+1]
                if (comparator.compare(array[j], array[j+1]) > 0) {
                    commonUtil.swap(array, j, j + 1);
                }
            }
        }
        return array;
    }
}
