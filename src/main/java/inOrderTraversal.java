import java.util.ArrayList;
import java.util.List;

public class inOrderTraversal {

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

    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode deepestRoot = root;
        TreeNode nodeToCheck = root;
        List<TreeNode> listOfUncheckedNodes = new ArrayList<>();
        List<Integer> markedNodes = new ArrayList<>();

        while(true) {
            while (nodeToCheck.left != null) {
                nodeToCheck = nodeToCheck.left;
                listOfUncheckedNodes.add(nodeToCheck);
            }
            markedNodes.add(nodeToCheck.val);
            if (nodeToCheck.right != null) {
                listOfUncheckedNodes.add(nodeToCheck);
                nodeToCheck = nodeToCheck.right;
            }
            return markedNodes;
        }

    }
}
