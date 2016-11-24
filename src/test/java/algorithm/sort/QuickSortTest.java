package algorithm.sort;

import org.testng.annotations.Test;
import printer.IntegerPrinter;
import printer.Printer;
import util.TypeConversionUtil;

/**
 * Test QuickSort
 */
public class QuickSortTest {

    //TODO - Add @Before and @After methods
    //TODO - Add Assertions
    @Test
    public void testQuickSort() {
        Sorter sorter = new QuickSort();
        Printer printer = new IntegerPrinter();

        int[] array = {1, 4, 7, 2, 9, 14, 8, 20};
        Integer[] intArray = TypeConversionUtil.convertIntArrayToIntegerArray(array);
        printer.printBefore(intArray);

        sorter.sort(array, 0, array.length - 1);
        intArray = TypeConversionUtil.convertIntArrayToIntegerArray(array);
        printer.printAfter(intArray);

    }
}
