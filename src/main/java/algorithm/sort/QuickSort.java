package algorithm.sort;

import util.CommonUtil;

import java.util.Comparator;


/**
 * QuickSort implementation
 */
public class QuickSort<E> implements Sorter<E> {

    CommonUtil commonUtil;

    public QuickSort() {
        commonUtil = new CommonUtil();
    }
    public E[] sort(E[] array, Comparator comparator, int start, int end) {

        //Base case | Termination condition for recursion
        if (start >= end) {
            return array;
        }

        int pivotIndex = partition(array, comparator, start, end);
        sort(array, comparator, start, pivotIndex - 1);
        sort(array, comparator, pivotIndex + 1, end);

        return array;
    }

    public int partition(E[] array, Comparator comparator, int start, int end) {
        E pivotElement = array[end];
        int pivotIndex = start;

        for (int i = start; i < end; i++) {
            if (comparator.compare(array[i], pivotElement) <0 ) {
                commonUtil.swap(array, i, pivotIndex);
                pivotIndex++;
            }
        }

        commonUtil.swap(array, pivotIndex, end);
        return pivotIndex;

    }
}
