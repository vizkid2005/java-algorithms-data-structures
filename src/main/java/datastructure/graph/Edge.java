package datastructure.graph;

/**
 * An undirected edge
 */
public class Edge {
    private int v;
    private int w;

    public Edge(int v, int w) {
        this.v = v;
        this.w = w;
    }

    public int either() {
        return v;
    }

    public int other(int vertex) {
        if (vertex == v) {
            return w;
        }
        return v;
    }
}
