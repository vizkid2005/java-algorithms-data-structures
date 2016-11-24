package algorithm.sort;

import static util.CommonUtil.swap;

/**
 * Implementation of BubbleSort
 */

public class BubbleSort implements Sorter {

    public int[] sort(int[] array, int start, int end) {

        int n = array.length;

        // Can be optimized further but the complexity will still be O(n^2)
        // Use QuickSort or MergeSort instead
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
        return array;
    }
}
