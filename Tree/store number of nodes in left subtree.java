static class TreeNode{
		int key ;
		TreeNode left ;
		TreeNode right ;
		int numNodesLeft ;
	
		public TreeNode( int key ) {
			this.key = key ;
}
}

public int numNodesLeft ( TreeNode root ) {
	// base case 
	if( root == null ) {
	return 0 ;
}
// recursive rule
int leftNum = numNodesLeft ( root.left ) ;
int rightNum = numNodesLeft ( root.right ) ;
root.numNodesLeft = leftNum ;
return leftNum  + rightNum  + 1 ;
}