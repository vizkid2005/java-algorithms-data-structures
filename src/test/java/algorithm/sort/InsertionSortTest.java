package algorithm.sort;

import org.testng.annotations.Test;
import printer.IntegerPrinter;
import printer.Printer;
import util.TypeConversionUtil;

/**
 * Test InsertionSort
 */
public class InsertionSortTest {

    @Test
    public void testInsertionSort() {
        Sorter sorter = new InsertionSort();
        Printer printer = new IntegerPrinter();

        printer.printAlgorithmName("InsertionSort");
        int[] array = {1, 4, 7, 2, 9, 14, 8, 20};
        Integer[] intArray = TypeConversionUtil.convertIntArrayToIntegerArray(array);
        printer.printBefore(intArray);

        sorter.sort(array, 0, array.length - 1);
        intArray = TypeConversionUtil.convertIntArrayToIntegerArray(array);
        printer.printAfter(intArray);
    }
}
