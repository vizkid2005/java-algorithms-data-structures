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
 * Test MergeSort
 */
public class MergeSortTest {

    //TODO - Add @Before and @After methods

    @Test(dataProvider = "intDataProvider" , dataProviderClass=SortDataProvider.class)
    public void testMergeSort(Printer printer, Comparator comparator, List unsortedList, List sortedList) {
        Sorter sorter = new MergeSort();

        printer.printAlgorithmName("MergeSort");
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
