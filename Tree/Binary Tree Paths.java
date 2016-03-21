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
    
        List<String> res = new ArrayList<String>();
    public List<String> binaryTreePaths(TreeNode root) {
        if(root != null)  findPaths(root, String.valueOf(root.val));
        return res;
    }
    
    public void findPaths(TreeNode n, String path){
        if(n.left == null && n.right == null) res.add(path);
        if(n.left != null) findPaths(n.left, path + "->" + n.left.val);
        if(n.right != null) findPaths(n.right, path + "->" + n.right.val);
    }
}