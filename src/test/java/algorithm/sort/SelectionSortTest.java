package algorithm.sort;

import org.testng.annotations.Test;
import printer.IntegerPrinter;
import printer.Printer;
import util.TypeConversionUtil;

/**
 * Test SelectionSort
 */
public class SelectionSortTest {

    @Test
    public void testSelectionSort() {
        Sorter sorter = new SelectionSort();
        Printer printer = new IntegerPrinter();

        printer.printAlgorithmName("SelectionSort");
        int[] array = {1, 4, 7, 2, 9, 14, 8, 20};
        Integer[] intArray = TypeConversionUtil.convertIntArrayToIntegerArray(array);
        printer.printBefore(intArray);

        sorter.sort(array, 0, array.length - 1);
        intArray = TypeConversionUtil.convertIntArrayToIntegerArray(array);
        printer.printAfter(intArray);

    }
}
