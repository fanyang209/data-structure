public int getNodesInLeft( TreeNode root ) {
	// base case
	if( root == null ) {
	return 0 ;
}
	// recursive rule 
int left = getNodesInLeft( root.left ) ;
int right = getNodesInLeft( root.right ) ;

root.totalLeft = left ;

return left + right + 1 ;
}