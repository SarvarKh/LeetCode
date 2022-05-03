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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return maxHelper(root);
    }
    
    private int maxHelper(TreeNode root) {
        return 1 + Math.max(
            root.left != null ? maxHelper(root.left) : 0,
            root.right != null ? maxHelper(root.right) : 0
        );
    }
}