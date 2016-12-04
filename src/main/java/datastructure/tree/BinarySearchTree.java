package datastructure.tree;

/**
 *  An implementation of a Binary Search Tree which is not self-balancing.
 */
public class BinarySearchTree {

    BSTNode root;

    public BinarySearchTree() {
        root = null;
    }

    public BSTNode getRoot() {
        return root;
    }

    public void setRoot(BSTNode root) {
        this.root = root;
    }

    public void insert(int data) {
        if (root == null) {
            BSTNode node = new BSTNode(data);
            this.root = node;
            return;
        }

        BSTNode current = root;
        //I could have used the recursive approach as well
        while(true) {
            if(data > current.getData())
            {
                if(current.getRightChild() == null) {
                    BSTNode node = new BSTNode(data);
                    current.setRightChild(node);
                    return;
                }
                current = current.getRightChild();
            }
            else {
                if(current.getLeftChild() == null) {
                    BSTNode node = new BSTNode(data);
                    current.setLeftChild(node);
                    return;
                }
                current = current.getLeftChild();
            }

        }
    }

    public void traverseInOrderTraverse() {
        if(this.root == null) {
            System.out.println("Emtpty Tree");

        }
    }


}
