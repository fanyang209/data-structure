public int maxSum( TreeNode root ) {
	// assumption: root is not null
	int global_max = Integer.MIN_VALUE  ;
	helper( root, global_max ) ;
	return global_max ;
}
public int helper( TreeNode root, int global_max ) {
	// base case
	if( root == null ) {
		return 0 ;
}
// recursive rule
int leftSum = helper( root.left, global_max ) ;
int rightSum = helper( root.right, global_max ) ;
int tempSum = leftSum + righSum + root.key ;
// when to update the global_max
if( root.left != null && root.right != null && tempSum > global_max ) {
	global_max = tempSum ;
}
if( root.left == null ) {
	return root.key + rightSum ;
} else if( root.right == null ) {
	return root.key + leftSum ;
} else {
	return root.key + Math.max( leftSum , rightSum ) ;
}
}