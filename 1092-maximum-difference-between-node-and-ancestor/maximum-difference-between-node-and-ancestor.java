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
    int max=0;
    public int maxAncestorDiff(TreeNode root) {
        dfs(root, root.val,root.val);
        return max;
    }
    public  void dfs(TreeNode node, int a, int b){
        if(node==null) return ;
        a=Math.min(a,node.val);
        b=Math.max(b,node.val);
        max= Math.max(max,b-a);
        dfs(node.left,a,b);
        dfs(node.right,a,b);
    }
}