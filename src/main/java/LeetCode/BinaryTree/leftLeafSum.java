package LeetCode.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class leftLeafSum {
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

    public int runningSum = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        if (root==null) return runningSum;

        if ((root.left!=null) && (root.left.left==null) && (root.left.right==null)) {
            runningSum+=root.left.val;
        }
        sumOfLeftLeaves(root.left);
        sumOfLeftLeaves(root.right);
        return runningSum;
    }
}
