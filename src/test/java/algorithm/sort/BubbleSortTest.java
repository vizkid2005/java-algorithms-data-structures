package algorithm.sort;

import algorithm.comparator.IntegerComparator;
import algorithm.sort.dataprovider.SortDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;
import printer.IntegerPrinter;
import printer.Printer;
import util.TypeConversionUtil;

import java.util.Comparator;
import java.util.List;

/**
 * BubbleSort Test
 */
public class BubbleSortTest {


    @Test (dataProvider = "intDataProvider" , dataProviderClass=SortDataProvider.class)
    public void testBubbleSort(Printer printer, Comparator comparator, List unsortedList, List sortedList) {
        Sorter sorter = new BubbleSort();

        printer.printAlgorithmName("BubbleSort");
        Object[] intArray = unsortedList.toArray();

        printer.printBefore(intArray);
        sorter.sort(intArray, comparator, 0, intArray.length - 1);
        printer.printAfter(intArray);

        Assert.assertTrue(intArray.length == sortedList.size());
        for(int i =0; i< intArray.length; i++) {
            Assert.assertTrue((int)intArray[i] == (int) sortedList.get(i));
        }
    }
}
