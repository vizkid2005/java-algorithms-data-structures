package datastructure.graph.grid;

public class Coordinate {
    int row;
    int col;
    boolean visited;
    Coordinate prev;

    public Coordinate(int row, int col) {
        this.row = row;
        this.col = col;
        this.visited = false;
        this.prev = null;
    }

    @Override
    public int hashCode() {
        return (row + 3) * (col + 5);
    }

    @Override
    public boolean equals(Object that) {

        if (this == that) {
            return true;
        }
        if (!(that instanceof Coordinate)) {
            return false;
        }
        if (this.row == ((Coordinate) that).row && this.col == ((Coordinate) that).col) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "(" + row + "," + col + ")";
    }
}
