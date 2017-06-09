package datastructure.graph;

import datastructure.graph.grid.Coordinate;
import datastructure.graph.grid.Maze;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by huzefa on 6/9/17.
 */
public class MazeTest {

    @Test
    public void mazeTest() throws FileNotFoundException, IOException {
        InputStream in = new FileInputStream("/Users/huzefa/workspace/java-algorithms-data-structures/src/main/resources/Maze.txt");
        Maze maze = new Maze(in);
        maze.printPathFrom(new Coordinate(0, 0), new Coordinate(2, 4));
    }
}
