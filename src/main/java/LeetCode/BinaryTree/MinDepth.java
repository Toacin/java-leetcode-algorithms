package LeetCode.BinaryTree;

public class MinDepth {
    public class Min {
        int val;
        Min() {};
        Min(int val) {
            this.val = val;
        }
    }
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        Min currentMin = new Min(100000);
        depthChecker(root, 0, currentMin);
        return currentMin.val+1;
    }

    public void depthChecker(TreeNode node, int prevDepth, Min currentMin) {
        if (node == null) return;

        int currentDepth = prevDepth+1;
        if (currentDepth>currentMin.val) return;

        if (node.left == null && node.right==null) {
            currentMin.val = currentDepth;
        } else {
            depthChecker(node.left, currentDepth, currentMin);
            depthChecker(node.right, currentDepth, currentMin);
        }
    }
}
