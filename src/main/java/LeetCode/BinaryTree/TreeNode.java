package LeetCode.BinaryTree;

public class TreeNode {
    int val;
    MaximumDepth.TreeNode left;
    MaximumDepth.TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, MaximumDepth.TreeNode left, MaximumDepth.TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
