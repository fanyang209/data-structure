public TreeNode removeAndReturnRoot( TreeNode root, int target ) {
	if( root == null ) {
		return root ;
}
if( root.val == target ) {
	if( root.left != null && root.right != null ) {
		root.val = findMin(root.right).val ;
		root.right = removeAndReturnRoot( root.right, root.val ) ;
} else {
	root = ( root.left != null ) ? root.left : root.right ;
}
} else if( root.val > target ){
	root.left = removeAndReturnRoot( root.left, target ) ;
} else if( root.val < target ) {
	root.right = removeAndReturnRoot( root.right, target ) ;
}
return root ;
}
public TreeNode findMin( TreeNode root ) {
	while( root.left.left != null ) {
		root = root.left ;
}
return root.left ;
}