public boolean isTweakedIdentical ( TreeNode one, TreeNode  two) {
	// base case
	if ( one == null && two == null ) {
	return true ;
} else if ( one == null || two == null ) {
	return false ;
} else if ( one.val != two.val ) {
	return false ;
}
// recursive rule
return  isTweakedIdentical ( one.left, two.left ) && isTweakedIdentical ( one.right, two.right )  ||   isTweakedIdentical ( one.left, two.right ) && isTweakedIdentical ( one.right, two.left ) ;
}