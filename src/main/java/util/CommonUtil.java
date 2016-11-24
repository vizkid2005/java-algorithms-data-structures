package util;

/**
 * Some common utility methods required by all algorithms
 */
public class CommonUtil {

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
