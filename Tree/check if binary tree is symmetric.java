public boolean isSymmetric ( TreeNode root ) {
	// base case
	if ( root == null ) {
	return true ;
}
return hepler( root.left, root.right ) ;
}

public boolean helper ( TreeNode  left, TreeNode right ) {
	// base case
	if ( left == null && right == null ) {
	return true ;
} else if ( left == null || right == null ) {
	return false;
} else if ( left.val != right.val ) {
	return false;
}
// recursive rule
return helper( left.left, right.right ) && helper( left.right, right.left ) ;
}