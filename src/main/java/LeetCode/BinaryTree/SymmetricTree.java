package LeetCode.BinaryTree;

public class SymmetricTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return checkSym(root.left, root.right);
    }

    public static boolean checkSym(TreeNode left, TreeNode right) {
        if ((left != null && right == null) || (left == null && right != null)) return false;
        else if (left == null && right == null) return true;
        else if (left.val == right.val) {
            boolean outerCheck = checkSym(left.left, right.right);
            boolean innerCheck = checkSym(left.right, right.left);
            return (outerCheck&&innerCheck);
        } else return false;
    }
}
