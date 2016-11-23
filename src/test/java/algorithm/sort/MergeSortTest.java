package algorithm.sort;

import org.testng.annotations.Test;
import printer.IntegerPrinter;
import printer.Printer;
import util.TypeConversionUtil;

/**
 * Test MergeSort
 */
public class MergeSortTest {

    //TODO - Add @Before and @After methods

    @Test
    public void testMergeSortWithEvenNumberOfElements() {
        Sorter sorter = new MergeSort();
        Printer printer = new IntegerPrinter();

        int[] array = {1, 4, 7, 2, 9, 14, 8, 20};
        Integer[] intArray = TypeConversionUtil.convertIntArrayToIntegerArray(array);
        printer.printBefore(intArray);

        sorter.sort(array, 0, array.length - 1);
        intArray = TypeConversionUtil.convertIntArrayToIntegerArray(array);
        printer.printAfter(intArray);

    }

    @Test
    public void testMergeSortWithEvenOddOfElements() {
        Sorter sorter = new MergeSort();
        Printer printer = new IntegerPrinter();

        int[] array = {1, 4, 7, 2, 9, 14, 8};
        Integer[] intArray = TypeConversionUtil.convertIntArrayToIntegerArray(array);
        printer.printBefore(intArray);

        sorter.sort(array, 0, array.length - 1);
        intArray = TypeConversionUtil.convertIntArrayToIntegerArray(array);
        printer.printAfter(intArray);

    }
}
