package LeetCode.BinaryTree;

import com.sun.source.tree.Tree;

public class heightBalancedTree {
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
    public class MaxDepth {
        int val;
        MaxDepth() {};
        MaxDepth(int val) {
            this.val = val;
        }
    }

    public boolean isBalanced(TreeNode root) {
        return depthChecker(root, new MaxDepth());
    }

    public boolean depthChecker(TreeNode node, MaxDepth depth) {
        if (node==null) return true;
        depth.val = depth.val+1;
        MaxDepth leftDepth = new MaxDepth(depth.val);
        MaxDepth rightDepth = new MaxDepth(depth.val);

        boolean leftCheck = depthChecker(node.left, leftDepth);
        boolean rightCheck = depthChecker(node.right, rightDepth);
        depth.val = Math.max(leftDepth.val, rightDepth.val);

        return ((leftDepth.val==rightDepth.val || leftDepth.val==rightDepth.val+1 || leftDepth.val==rightDepth.val-1) && (leftCheck) && (rightCheck));
    }
}
