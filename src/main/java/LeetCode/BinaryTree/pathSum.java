package LeetCode.BinaryTree;

public class pathSum {
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

    public class pathFoundBoolean {
        boolean found;
        pathFoundBoolean() {};
        pathFoundBoolean(boolean found) {
            this.found = found;
        }
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        pathFoundBoolean pathFound = new pathFoundBoolean();
        sumChecker(root, targetSum, 0, pathFound);
        return pathFound.found;
    }

    public void sumChecker(TreeNode node, int targetSum, int prevTotal, pathFoundBoolean pathFound) {
        if (node==null || pathFound.found) return;

        int currentTotal = prevTotal + node.val;
        if (currentTotal == targetSum && node.left==null && node.right==null) pathFound.found = true;
        else {
            sumChecker(node.left, targetSum, currentTotal, pathFound);
            sumChecker(node.right, targetSum, currentTotal, pathFound);
        }
    }
}
