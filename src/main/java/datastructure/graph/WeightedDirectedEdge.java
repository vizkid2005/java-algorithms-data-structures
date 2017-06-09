package datastructure.graph;

/**
 * A Weighted directed edge
 */
public class WeightedDirectedEdge {
    double weight;
    int v;
    int w;

    public WeightedDirectedEdge(int from, int to, double weight) {
        v = from;
        w = to;
        this.weight = weight;
    }

    public int from() {
        return v;
    }

    public int to() {
        return w;
    }

}
