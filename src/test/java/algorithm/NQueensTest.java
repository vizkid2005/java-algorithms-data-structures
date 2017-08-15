package algorithm;

import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by huzefa on 7/18/17.
 */
public class NQueensTest {

    @Test
    public void testNQueens() {
        NQueens nQueens = new NQueens();
        List<List<String>> results = nQueens.solveNQueens(4);
        System.out.println("Done");
    }
}
