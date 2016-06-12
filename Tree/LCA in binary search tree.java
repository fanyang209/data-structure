public TreeNode LCA( TreeNode root, TreeNode one, TreeNode two ) {
	// base case
	if( root == null ) {
		return null ;
}
if( root = one || root == two ) {
	return root ;
}

// recursive rule
if( root.value < one.value && root.value < two.value ) {
	return LCA( root.right, one, two ) ;
} else if( root.value > one.value && root.value > two.value ) {
return LCA( root.left, one, two ) ;	
} else {
return root ;	
}
}