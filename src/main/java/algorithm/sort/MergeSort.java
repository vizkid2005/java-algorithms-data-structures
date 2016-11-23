package algorithm.sort;

/**
 * An implementation of Merge Sort
 */
public class MergeSort implements Sorter {

    public int[] sort(int[] inputArray, int start, int end) {

        //Base condition or termination condition for recursion
        if (inputArray.length < 2) {
            return inputArray;
        }

        //Let us split the array into 2.
        int midPoint = inputArray.length / 2;

        //We allocate 2 more arrays to sort the split halves
        int[] left = new int[midPoint];
        int[] right = new int[inputArray.length - midPoint];

        //Assign values to the left half
        for (int i = 0; i < midPoint; i++) {
            left[i] = inputArray[i];
        }

        //Assign values to the the right half
        for (int j = midPoint; j < inputArray.length; j++) {
            right[j - midPoint] = inputArray[j];
        }

        //Call the sort function recursively on the 2 halves
        sort(left, 0, left.length - 1);
        sort(right, 0, right.length - 1);

        merge(left, right, inputArray);

        return inputArray;
    }

    public void merge(int[] left, int[] right, int[] inputArray) {

        int leftLength = left.length;
        int rightLength = right.length;

        //Initialize counters to go over left, right and inputArray
        int i = 0;
        int j = 0;
        int k = 0;

        //While both arrays have elements to be put in sorted order
        while (i < leftLength && j < rightLength) {
            if (left[i] <= right[j]) {
                inputArray[k] = left[i];
                i++;
            } else {
                inputArray[k] = right[j];
                j++;
            }
            k++;
        }

        //Copy the remainder of the elements from the left array
        while (i < leftLength) {
            inputArray[k] = left[i];
            i++;
            k++;
        }

        //Copy the remainder of the elements from the right array
        while (j < rightLength) {
            inputArray[k] = right[j];
            j++;
            k++;
        }
    }
}
