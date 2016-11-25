package util;

/**
 * Some common utility methods required by all algorithms
 */
public class CommonUtil<E> {

    public void swap(E[] array, int i, int j) {
        E temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
