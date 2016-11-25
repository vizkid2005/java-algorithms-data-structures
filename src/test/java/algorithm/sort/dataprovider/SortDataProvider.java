package algorithm.sort.dataprovider;

import algorithm.comparator.IntegerComparator;
import org.testng.annotations.DataProvider;
import printer.IntegerPrinter;
import printer.Printer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 * Data Provider for the Sorting algorithms
 */
public class SortDataProvider {

    @DataProvider(name = "intDataProvider")
    public static Object[][] getIntegerData()  {
        Printer printer = new IntegerPrinter();
        Comparator comparator = new IntegerComparator();
        List unsortedList = generateListWithRandomNumbers(100, 100000);
        List sortedList = getSortedList(unsortedList, comparator);

        List oddUnsortedList = generateListWithRandomNumbers(7, 100000);
        List oddSortedList = getSortedList(oddUnsortedList, comparator);

        List singleElementList = generateListWithRandomNumbers(1, 100000);
        List singleSortedList = getSortedList(singleElementList, comparator);
        return new Object[][] {
                {printer, comparator, unsortedList, sortedList},
                {printer, comparator, oddUnsortedList, oddSortedList},
                {printer, comparator, singleElementList, singleSortedList}
        };
    }

    private static List generateListWithRandomNumbers(int n, int upperBound) {
        Random random = new Random();
        List list = new ArrayList();
        for(int i=0; i<n; i++) {
            list.add(new Integer(random.nextInt(upperBound)));
        }
        return list;
    }

    private static List getSortedList(List unsortedList, Comparator comparator) {

        List sortedList = new ArrayList(unsortedList);
        sortedList.sort(comparator);
        return sortedList;
    }
}
