package LeetCode.BinaryTree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
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

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> returnList = new ArrayList<>();
        if (root==null) return returnList;

        if (root.left==null && root.right==null) {
            returnList.add(root.val+"");
            return returnList;
        }

        pathDeveloper(root.left, root.val+"", returnList);
        pathDeveloper(root.right, root.val+"", returnList);
        return returnList;
    }

    public static void pathDeveloper(TreeNode node, String currentString, List<String> returnList) {
        if (node == null) return;
        String newString = currentString+"->"+node.val;
        if ((node.left == null) && (node.right == null)) {
            returnList.add(newString);
        } else {
            pathDeveloper(node.left, newString, returnList);
            pathDeveloper(node.right, newString, returnList);
        }
    }
}
