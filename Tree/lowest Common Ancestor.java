public TreeNode lowestCommonAncestor( TreeNode root, TreeNode one, TreeNode two ) {
	// base case
	if( root == null || root == one || root == two ) {
	return root ;
}
TreeNode ll = lowestCommonAncestor( root.left, one, two ) ;
TreeNode lr = lowestCommonAncestor( root.right, one, two ) ;
if( ll != null && rr != null ) {
	return root ;
} else if ( ll != null ) {
	return ll ;
} else {
	return lr ;
}
}