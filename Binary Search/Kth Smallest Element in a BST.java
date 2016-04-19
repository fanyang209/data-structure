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
    public int kthSmallest(TreeNode root, int k) {
        if(root == null){
            return 0;
        }
        List<Integer> list = new ArrayList<Integer>();
        dfs(root, list);
        return list.get(k - 1);
    }
    
    public void dfs(TreeNode t, List<Integer> list){
        if(t.left == null && t.right == null){
            list.add(t.val);
            return;
        }
        if(t.left != null) dfs(t.left, list);
        list.add(t.val);
        if(t.right != null) dfs(t.right, list);
        return;
    }
}