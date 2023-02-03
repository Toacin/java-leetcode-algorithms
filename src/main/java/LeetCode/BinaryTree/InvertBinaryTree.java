package LeetCode.BinaryTree;

import java.util.Stack;

public class InvertBinaryTree {

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

    public TreeNode invertTree(TreeNode root) {
        if (root==null) return root;

        TreeNode temporaryLeft = root.left;
        root.left = root.right;
        root.right = temporaryLeft;

        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
