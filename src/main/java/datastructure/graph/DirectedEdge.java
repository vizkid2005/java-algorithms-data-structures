package datastructure.graph;

/**
 * DirectedEdge from v to w for
 */
public class DirectedEdge {

    private int v;
    private int w;

    public DirectedEdge(int from, int to) {
        v = from;
        w = to;
    }

    public int from() {
        return v;
    }

    public int to() {
        return w;
    }
}
