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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null) return res;
        
        boolean odd = true;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        while(!q.isEmpty()){
             // level traversal
              int qLen = q.size();
              ArrayList<Integer> level = new ArrayList<Integer>();
              for(int i = 0; i < qLen; i++){
                  TreeNode node = q.poll();
                  level.add(node.val);
                  if(node.left != null) q.offer(node.left);
                  if(node.right != null) q.offer(node.right);
              }
              // add level order reverse for even
              if(odd){
                  res.add(level);
              }else{
                  Collections.reverse(level);
                  res.add(level);
              }
              // flip odd and even
              odd = !odd;
        }
        return res;
    }
}