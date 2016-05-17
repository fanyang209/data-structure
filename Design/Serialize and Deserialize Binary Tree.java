/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        if(root == null) return sb.toString();
        
        seriaHelper(root, sb);
        
        return sb.substring(0, sb.length() - 1);
        
    }
    
    private void seriaHelper(TreeNode root, StringBuilder sb){
        if(root == null){
            sb.append("#,");
        }else{
            sb.append(root.val).append(",");
            seriaHelper(root.left, sb);
            seriaHelper(root.right, sb);
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data == null || data.length() == 0 ) return null;
        
        Deque<String> nodes = new LinkedList<>();
        nodes.addAll(Arrays.asList(data.split(",")));
        return desriaHelper(nodes);
    }
    
        private TreeNode desriaHelper(Deque<String> nodes){
            
            String val = nodes.remove();
            if(val.equals("#")) return null;
            
            TreeNode root = new TreeNode(Integer.valueOf(val));
            root.left = desriaHelper(nodes);
            root.right = desriaHelper(nodes);
            
            return root;
        }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));