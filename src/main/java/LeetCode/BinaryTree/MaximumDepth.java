package LeetCode.BinaryTree;

public class MaximumDepth {
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

    public static class Max {
        int val;
        Max() {}
        Max(int val) {
            this.val = val;
        }
    }

    public int maxDepth(TreeNode root) {
        Max max = new Max();
        treeTraverser(root, 0, max);
        return max.val;
    }

    public static void treeTraverser(TreeNode node, int depth, Max max) {
        if (node == null) return;

        int currentDepth = depth+1;
        if (currentDepth>max.val) max.val = currentDepth;
        treeTraverser(node.left, currentDepth, max);
        treeTraverser(node.right, currentDepth, max);
    }
}
