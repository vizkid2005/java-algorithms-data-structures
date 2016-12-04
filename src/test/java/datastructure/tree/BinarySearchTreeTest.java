package datastructure.tree;

import org.testng.annotations.Test;

/**
 * Testing the Binary Search Tree
 */
public class BinarySearchTreeTest {

    @Test
    public void testBinarySearchTree() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(15);
        bst.insert(10);
        bst.insert(20);
        bst.insert(5);
        bst.insert(11);
        bst.insert(16);
        bst.insert(25);
        bst.insert(12);
        bst.insert(23);
    }


}
