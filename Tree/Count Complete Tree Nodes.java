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
    public int countNodes(TreeNode root) {
        return countNodes(root, -1, -1);
    }
    
    public int countNodes(TreeNode root, int lheight, int rheight){
        // 如果没有上轮计算好的左子树深度，计算其深度
        if(lheight == -1){
            lheight = 0;
            TreeNode cur = root;
            while(cur != null){
                lheight++;
                cur = cur.left;
            }
        }
         // 如果没有上轮计算好的右子树深度，计算其深度
         if(rheight == -1){
            rheight = 0;
            TreeNode cur = root;
            while(cur != null){
                rheight++;
                cur = cur.right;
            }
        }
        
        // 如果两个深度一样，返回2^h-1
        if(lheight == rheight){
        return (1 << lheight) - 1;
        }
        return 1 + countNodes(root.left, lheight - 1, -1) + countNodes(root.right, -1, rheight - 1);
        
    }
}