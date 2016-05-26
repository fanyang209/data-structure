public boolean isBST ( TreeNode root ) {
	
	return isBST ( root, Integer.MAX_VALUE, Integer.MIN_VALUE ) ;
}

public boolean isBST( TreeNode root, int max, int min ) {
	// base case
	if ( root == null ) {
	return true ;
}
if ( root.val <= min || root.val >= max ) {
	return false ;
}
return isBST( root.left, root.val , min )  && isBST( root.right, max, root.val ) ;
}