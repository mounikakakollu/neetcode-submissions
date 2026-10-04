/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public TreeNode invertTree(TreeNode root) {
        List<TreeNode> stack = new ArrayList<TreeNode>();
        if (root == null) {
            return root;
        }
        stack.add(root);
        while(stack.size()>0) {
            TreeNode currNode = stack.removeLast();
            TreeNode tmp = currNode.left;
            currNode.left = currNode.right;
            currNode.right = tmp;

            if (currNode.left != null) {
                stack.add(currNode.left);
            }

            if (currNode.right != null) {
                stack.add(currNode.right);
            }
        }
        return root;
    }
}
