package datastructure.tree;

/**
 * The building block of a Binary Search Tree
 */
public class BSTNode {
    private BSTNode leftChild;
    private BSTNode rightChild;
    private int data;

    public BSTNode(int data) {
        this.data = data;
        this.rightChild = null;
        this.leftChild = null;
    }

    public BSTNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BSTNode leftChild) {
        this.leftChild = leftChild;
    }

    public BSTNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(BSTNode rightChild) {
        this.rightChild = rightChild;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
