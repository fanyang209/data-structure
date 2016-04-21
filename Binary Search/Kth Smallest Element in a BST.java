/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
        int counter = 0 ;
        int res ;
    public int kthSmallest(TreeNode root, int k) {
        dfs( root, k ) ;    
        return res;
    }
    
    public void dfs( TreeNode root, int k ) {
        if( root == null ) {
            return;
        }
        dfs(root.left, k ) ;
        counter++ ;
        if(counter == k ) {
            res = root.val ;
            return ;
        }
        dfs(root.right, k ) ;
    }
}