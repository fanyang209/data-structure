public TreeNode closest( TreeNode root, int target ) {
	if( root == null ) {
	return null ;
}
TreeNode res = root ;
while( root != null ) {
	if( root.val == target ) {
		return root ;
} else {
	if( Math.abs( root.val - target ) < Math.abs( res.val - target ) ) {
		res = root ;
}
if( root.val < target ) {
	root = root.right ;
} else {
	root = root.left ;
}
}
}
return res ;
}