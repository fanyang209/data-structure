public TreeNode largestSmaller( TreeNode root, int target ) {
	if( root == null ) {
		return null ;
}
TreeNode res = root ;
while( root != null ) {
	if( root.val < target ) {
		if( Math.abs( root.val - target) > Math.abs( res.val - target ) ){
			res = root ;
}
root = root.right ;
} else {
	root = root.left ;
}
}
return res ;
}