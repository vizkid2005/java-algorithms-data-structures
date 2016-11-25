package algorithm.sort;

import util.CommonUtil;

import java.util.Comparator;


/**
 * Implementation of SelectionSort
 */
public class SelectionSort<E> implements Sorter<E> {

    CommonUtil commonUtil;
    public SelectionSort() {
        commonUtil = new CommonUtil();
    }
    public E[] sort(E[] array, Comparator comparator, int start, int end) {

        int n = array.length;
        for (int i = 0; i < n - 1; i++) {

            //Initializing the minimum value and its index in the array
            int minIndex = i;
            E minimum = array[i];

            //Traverse the entire array to find the minimum element
            for (int j = i + 1; j < n; j++) {
                if (comparator.compare(array[j],  minimum) <=0) {
                    minimum = array[j];
                    minIndex = j;
                }
            }

            //Swap the current element with the minimum element, this makes it in-place
            commonUtil.swap(array, i, minIndex);
        }

        return array;
    }
}
