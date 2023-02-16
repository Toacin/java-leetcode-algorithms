package LeetCode.BinaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LevelOrderTraversal {
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

    public List<List<Integer>> levelOrder(TreeNode root) {
        HashMap<Integer, List<Integer>> valuesAtLevel = new HashMap<>();
        hashmapValueAdder(root, 0, valuesAtLevel);

        List<List<Integer>> finalList = new ArrayList<>();
        for (Integer depth : valuesAtLevel.keySet()) {
            finalList.add(valuesAtLevel.get(depth));
        }

        return finalList;
    }

    public void hashmapValueAdder(TreeNode node, int prevDepth, HashMap<Integer, List<Integer>> valuesAtLevel) {
        if (node == null) return;
        int currentDepth = prevDepth+1;
        if (valuesAtLevel.get(currentDepth) == null) {
            List<Integer> newList = new ArrayList<>();
            newList.add(node.val);
            valuesAtLevel.put(currentDepth, newList);
        } else {
            List<Integer> prevList = valuesAtLevel.get(currentDepth);
            prevList.add(node.val);
            valuesAtLevel.put(prevDepth+1, prevList);
        }

        hashmapValueAdder(node.left, currentDepth, valuesAtLevel);
        hashmapValueAdder(node.right, currentDepth, valuesAtLevel);
    }
}
