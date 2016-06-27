public TreeNode closest( TreeNode root, int target ) {
	if( root == null ) {
		return null ;
}
TreeNode res = root ;
while( root != null ) {
	if( root.key == target ) {
	return root ;
} else {
	if( Math.abs(root.key - target ) < Math.abs(res.key - target ) ){
		res = root ;
}
if( root.key < target ) {
	root = root.right ;
} else {
	root = root.left ;
}
}
}
reutrn res ; 
}