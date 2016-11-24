package algorithm.sort;

import static util.CommonUtil.swap;

/**
 * Implementation of SelectionSort
 */
public class SelectionSort implements Sorter {

    public int[] sort(int[] array, int start, int end) {

        int n = array.length;
        for (int i = 0; i < n - 1; i++) {

            //Initializing the minimum value and its index in the array
            int minIndex = i;
            int minimum = array[i];

            //Traverse the entire array to find the minimum element
            for (int j = i + 1; j < n; j++) {
                if (array[j] <= minimum) {
                    minimum = array[j];
                    minIndex = j;
                }
            }

            //Swap the current element with the minimum element, this makes it in-place
            swap(array, i, minIndex);
        }

        return array;
    }
}
