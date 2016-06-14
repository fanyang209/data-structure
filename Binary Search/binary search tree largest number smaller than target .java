public TreeNode largestSmaller( TreeNode root, int target ) {
	if( root == null ) {
		return null ;
}
TreeNode res = root ;
while( root != null ) {
	if( root.key < target ) {
	if( Math.abs(root.key - target ) > Math.abs(res.key - target )){
	res = root ;
}
root = root.right ;
} else {
	root = root.left ;
}
}
return res ;
}