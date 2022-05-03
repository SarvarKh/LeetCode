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
    public List<Integer> postorderTraversal(TreeNode root) {
        return dfs(root, new ArrayList());
    }
    
    private List<Integer> dfs(TreeNode root, List<Integer> list) {
        if(root == null) return list;
        
        list = dfs(root.left, list);
        list = dfs(root.right, list);
        list.add(root.val);
        return list;
    }
}