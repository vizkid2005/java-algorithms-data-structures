package algorithm.sort;

/**
 * Implementation of InsertionSort
 */
public class InsertionSort implements Sorter {

    public int[] sort(int[] array, int start, int end) {

        int n = array.length;

        for(int i =1; i<n; i++) {
            //The element that we want to "insert" in the right place
            int currentElement = array[i];

            //The index of the proverbial empty space where we will insert the element
            int emptySpace = i;

            while(emptySpace > 0 && array[emptySpace-1] > currentElement) {
                //Shift all the elements greater than the current value to the right
                array[emptySpace] = array[emptySpace-1];
                emptySpace--;
            }

            array[emptySpace] = currentElement;
        }
        return array;
    }
}
