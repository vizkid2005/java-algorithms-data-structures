package dp;

public class BSTNodeSwap {

    TreeNode toSwap1, toSwap2, prev;

    public void recoverTree(TreeNode root) {
        prev = new TreeNode(Integer.MIN_VALUE);
        inOrderTraversal(root);

        int temp = toSwap1.val;
        toSwap1.val = toSwap2.val;
        toSwap2.val = temp;

    }


    public void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        inOrderTraversal(root.left);
        if (toSwap1 == null && prev.val >= root.val) {
            toSwap1 = prev;
        }
        if (toSwap1 != null && prev.val >= root.val) {
            toSwap2 = root;
        }
        prev = root;
        inOrderTraversal(root.right);
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}
