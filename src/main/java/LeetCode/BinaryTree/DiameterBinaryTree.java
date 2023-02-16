package LeetCode.BinaryTree;

public class DiameterBinaryTree {
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

    public static class DepthCounter {
        int val;
        DepthCounter() {}
        DepthCounter(int val) {
            this.val = val;
        }
    }
    public int maxDist = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root==null) return 0;
        DepthCounter leftDepth = new DepthCounter();
        DepthCounter rightDepth = new DepthCounter();
        maxDepth(root.left, 0, leftDepth);
        maxDepth(root.right, 0, rightDepth);
        if ((leftDepth.val + rightDepth.val)>maxDist) maxDist = (leftDepth.val+rightDepth.val);
        diameterOfBinaryTree(root.left);
        diameterOfBinaryTree(root.right);
        return maxDist;
    }

    public void maxDepth(TreeNode node, int prevDepth, DepthCounter max) {
        if (node==null) return;
        int currentDepth = prevDepth+1;
        if (currentDepth>max.val) max.val=currentDepth;
        maxDepth(node.left, currentDepth, max);
        maxDepth(node.right, currentDepth, max);
    }
}
