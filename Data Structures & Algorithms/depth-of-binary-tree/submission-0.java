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
    int answer = 1;
    public int maxDepth(TreeNode root) {
        dfs(root,1);
        return root==null ? 0 : answer;
    }
    void dfs(TreeNode node,int depth){
        if(node==null) return;
        answer = Math.max(depth,answer);
        dfs(node.left,depth+1);
        dfs(node.right,depth+1);
    }
}
