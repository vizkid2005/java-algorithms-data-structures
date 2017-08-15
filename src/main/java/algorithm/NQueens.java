package algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huzefa on 7/18/17.
 */
public class NQueens {

    public List<List<String>> solveNQueens(int n) {
        List<Integer> intermediate = new ArrayList<>();
        List<List<Integer>> results = new ArrayList<>();
        nQueensHelper(0, n, intermediate, results);
        return prettyPrint(results);
    }

    private void nQueensHelper(int row, int n, List<Integer> intermediate, List<List<Integer>> results) {

        if (row > n) {
            return;
        }
        if (isValidConfig(intermediate) && row == n) {
            results.add(new ArrayList<>(intermediate));
            return;
        }

        for (int i = 0; i < n; i++) {
            intermediate.add(i);
            nQueensHelper(row + 1, n, intermediate, results);
            intermediate.remove(intermediate.size() - 1);
        }
    }

    private List<List<String>> prettyPrint(List<List<Integer>> solutions) {
        List<List<String>> results = new ArrayList<>();
        for (List<Integer> solution : solutions) {
            results.add(prettyPrintLine(solution));
        }
        return results;
    }

    private List<String> prettyPrintLine(List<Integer> solution) {
        List<String> result = new ArrayList<>();

        for (int row : solution) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < solution.size(); i++) {
                if (i == row) {
                    sb.append("Q");
                    continue;
                }
                sb.append(".");
            }
            result.add(sb.toString());
        }
        return result;
    }

    private boolean isValidConfig(List<Integer> intermediate) {
        for (int i = 0; i < intermediate.size(); i++) {
            for (int j = i + 1; j < intermediate.size(); j++) {
                int row1 = i;
                int col1 = intermediate.get(i);
                int row2 = j;
                int col2 = intermediate.get(j);

                if (col1 == col2 || (row1 + col1) == (row2 + col2) || (row1 - col1) == (row2 - col2)) {
                    return false;
                }
            }
        }
        return true;
    }
}