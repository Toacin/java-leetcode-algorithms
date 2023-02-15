package LeetCode.BinaryTree;

public class sameTree {
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

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if ((p==null && q!=null) || (p!=null && q==null)) return false;
        else if (p==null && q==null) return true;
        else if (p.val == q.val) {
            boolean leftSide = isSameTree(p.left, q.left);
            boolean rightSide = isSameTree(p.right, q.right);
            return (leftSide&&rightSide);
        } else return false;
    }
}
