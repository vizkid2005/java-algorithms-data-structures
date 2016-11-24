package algorithm.sort;

import static util.CommonUtil.swap;

/**
 * QuickSort implementation
 */
public class QuickSort implements Sorter {

    public int[] sort(int[] array, int start, int end) {

        //Base case | Termination condition for recursion
        if (start >= end) {
            return array;
        }

        int pivotIndex = partition(array, start, end);
        sort(array, start, pivotIndex - 1);
        sort(array, pivotIndex + 1, end);

        return array;
    }

    public int partition(int[] array, int start, int end) {
        int pivotElement = array[end];
        int pivotIndex = start;

        for (int i = start; i < end; i++) {
            if (array[i] < pivotElement) {
                swap(array, i, pivotIndex);
                pivotIndex++;
            }
        }

        swap(array, pivotIndex, end);
        return pivotIndex;

    }
}
