public class Solution {

    int maxdepth = 0;
    List<Integer> res;

    public List<Integer> rightSideView(TreeNode root) {
        res = new LinkedList<Integer>();
        if(root!=null) helper(root,1);
        return res;
    }

    private void helper(TreeNode root, int depth){
        if(depth>maxdepth){
            maxdepth = depth;
            res.add(root.val);
        }
        if(root.right!=null) helper(root.right, depth+1);
        if(root.left!=null) helper(root.left, depth+1);
    }


}