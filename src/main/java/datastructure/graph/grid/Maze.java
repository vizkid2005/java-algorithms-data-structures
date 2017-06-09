package datastructure.graph.grid;

import java.io.InputStream;
import java.util.*;

public class Maze {

    final int[][] neighbors = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
    Map<Coordinate, Set<Coordinate>> adjList;
    Deque<Coordinate> path;

    public Maze(InputStream inputStream) {
        adjList = new HashMap<>();
        path = new LinkedList<>();
        Scanner scanner = new Scanner(inputStream);
        LinkedList<Coordinate> myBag = new LinkedList<>();
        while (scanner.hasNext()) {
            String[] line = scanner.next().split(",");
            Coordinate c = new Coordinate(Integer.parseInt(line[0]), Integer.parseInt(line[1]));
            myBag.add(c);
        }
        for (Coordinate current : myBag) {
            adjList.put(current, new LinkedHashSet<>());
        }
        for (Coordinate current : myBag) {
            for (int[] shift : neighbors) {
                Coordinate neighbor = new Coordinate(current.row + shift[0], current.col + shift[1]);
                if (adjList.containsKey(neighbor)) {
                    adjList.get(current).add(neighbor);
                    adjList.get(neighbor).add(current);

                }
            }
        }
        System.out.println("The maze looks like: ");
        for (Map.Entry<Coordinate, Set<Coordinate>> e : adjList.entrySet()) {
            Coordinate c = e.getKey();
            System.out.print(c + " is connected to ");
            for (Coordinate l : e.getValue()) {
                System.out.print(l + " -> ");
            }
            System.out.println();
        }
    }

    public void printPathFrom(Coordinate s, Coordinate e) {
        hasPath(s, e, new HashSet<>());
        System.out.println("The path is: ");
        for (Coordinate c : path) {
            System.out.print(c + " -> ");
        }
    }

    public boolean hasPath(Coordinate current, Coordinate e, Set<Coordinate> visited) {
        if (visited.contains(current) || !adjList.containsKey(current)) {
            return false;
        }
        if (current.equals(e)) {
            path.push(current);
            visited.add(current);
            return true;
        }
        visited.add(current);
        System.out.println("Visiting Node: " + current);
        for (Coordinate neighbor : adjList.get(current)) {
            System.out.println("    Visiting Child Node: " + neighbor);
            if (hasPath(neighbor, e, visited)) {
                path.push(current);
                return true;
            }
        }
        return false;
    }
}
