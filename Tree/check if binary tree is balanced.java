public boolean isBalanced( TreeNode root ) {
	// base case
	if ( root == null ) {
	return true ;
}
// recursive rule
if (Math.abs( getHeight( root.left ) - getHeight( root.right ) ) > 1 ) {
	return false ;
}
return isBalanced( root.left ) && isBalanced( root.right ) ;
}

public int getHeight( TreeNode root ) {
	// base case
	if ( root == null ) {
	return 0 ;
}
// recursive rule
return 1 + Math.max( getHeight( root.left ), getHeight( root.right )) ;
}