public TreeNode LCA ( TreeNode root, TreeNode one, TreeNode two ) {
	// base case
	if( root == null ) {
	return null ;
}
if( root == one || root == two ) {
	return root ;
}

	// recursive rule
	TreeNode ll = LCA( root.left, one , two ) ;
TreeNode lr = LCA( root.right, one , two ) ;
if( ll != null && lr != null ) {
	return root ;
} else if( ll != null ) {
	return ll ;
} else {
	return lr ;
}
}