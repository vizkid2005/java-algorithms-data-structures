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

    /**
     * Wrapper for inserting nodes recursively in a BST
     *
     * @param data
     */
    public void insertRecursive(int data) {
        this.root = recursiveInsert(this.root, data);
    }

    /**
     * Recursive implementation of inserting nodes in a BST
     *
     * @param node
     * @param data
     * @return
     */
    private BSTNode recursiveInsert(BSTNode node, int data) {
        //Base Condition
        if (node == null) {
            return new BSTNode(data);
        }
        //If data is less than value of the node it belongs in the left subtree
        else if (data <= node.getData()) {
            node.setLeftChild(recursiveInsert(node.getLeftChild(), data));
        }
        //The only other option is to insert it to the right
        else {
            node.setRightChild(recursiveInsert(node.getRightChild(), data));
        }
        return node;
    }

    public void insert(int data) {
        if (root == null) {
            this.root = new BSTNode(data);
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

    /**
     * A wrapper over the private inorder traversal method
     */
    public void inOrderTraversal() {
        System.out.println();
        traverseInOrder(this.root);
    }

    /**
     * A wrapper over the preorder traversal method
     */
    public void preOrderTraversal() {
        System.out.println();
        traversePreOrder(this.root);
    }

    /**
     * A wrapper over the postorder traversal method
     */
    public void postOrderTraversal() {
        System.out.println();
        traversePostOrder(this.root);
    }

    private void traversePostOrder(BSTNode node) {
        if (node == null) {
            return;
        }
        traversePostOrder(node.getLeftChild());
        traversePostOrder(node.getRightChild());
        System.out.print(node.getData() + " ");
    }

    /**
     * Preorder traversal of a Binary Tree
     *
     * @param node
     */
    private void traversePreOrder(BSTNode node) {

        if (node == null) {
            return;
        }
        System.out.print(node.getData() + " ");
        traversePreOrder(node.getLeftChild());
        traversePreOrder(node.getRightChild());
    }

    /**
     * Inorder traversal of a Binary Tree
     *
     * @param node
     */
    private void traverseInOrder(BSTNode node) {

        if (node == null) {
            return;

        }
        traverseInOrder(node.getLeftChild());
        System.out.print(node.getData() + " ");
        traverseInOrder(node.getRightChild());

    }


}
