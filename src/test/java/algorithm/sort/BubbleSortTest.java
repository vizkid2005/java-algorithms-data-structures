package algorithm.sort;

import org.testng.annotations.Test;
import printer.IntegerPrinter;
import printer.Printer;
import util.TypeConversionUtil;

/**
 * BubbleSort Test
 */
public class BubbleSortTest {

    @Test
    public void testBubbleSort() {
        Sorter sorter = new BubbleSort();
        Printer printer = new IntegerPrinter();

        printer.printAlgorithmName("BubbleSort");
        int[] array = {1, 4, 7, 2, 9, 14, 8, 20};
        Integer[] intArray = TypeConversionUtil.convertIntArrayToIntegerArray(array);
        printer.printBefore(intArray);

        sorter.sort(array, 0, array.length - 1);
        intArray = TypeConversionUtil.convertIntArrayToIntegerArray(array);
        printer.printAfter(intArray);

    }
}
