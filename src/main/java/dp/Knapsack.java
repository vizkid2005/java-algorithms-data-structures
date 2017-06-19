package dp;

import java.util.ArrayList;
import java.util.List;

/**
 * 0/1 knapsack
 */

public class Knapsack {


    public static void main(String[] args) {
        Knapsack k = new Knapsack();
        List<Item> items = new ArrayList<>();
        items.add(new Item(1, 3, 2));
        items.add(new Item(2, 4, 4));
        items.add(new Item(3, 1, 5));

        System.out.println("The max value you can get for wt 7: " + k.getKnapSackItems(items, 7));
    }

    public int getKnapSackItems(List<Item> items, int maxwt) {
        Cell[][] table = new Cell[items.size() + 1][maxwt + 1];
        for (int i = 0; i <= items.size(); i++) {
            for (int j = 0; j <= maxwt; j++) {
                if (i == 0 || j == 0) {
                    table[i][j] = new Cell(0);
                    continue;
                }

                if (j - items.get(i - 1).wt >= 0) {
                    if (table[i - 1][j].val < table[i - 1][j - items.get(i - 1).wt].val + items.get(i - 1).val) {
                        table[i][j] = new Cell(table[i - 1][j - items.get(i - 1).wt].val + items.get(i - 1).val);
                    } else {
                        table[i][j] = new Cell(table[i - 1][j].val);
                    }
                } else {
                    table[i][j] = new Cell(table[i - 1][j].val);
                }

            }
        }

        return table[items.size()][maxwt].val;

    }

    static class Item {
        int wt;
        int val;
        int id;

        public Item(int id, int wt, int val) {
            this.wt = wt;
            this.val = val;
            this.id = id;
        }
    }

    private class Cell {
        int val;


        public Cell(int val) {
            this.val = val;
        }
    }

}
