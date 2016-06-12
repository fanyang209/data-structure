public TreeNode LCA( TreeNode root, TreeNode one, TreeNode two ) {
	// base case
	if( root == null ) {
		return null ;
}
if( root == one || root == two ) {
	return root ;
}

// recursive rule 
int counter = 0 ;
TreeNode last ;
for( int i = 0 ; i < root.child.length; i++ ) {
	if( LCA( root.child[ i ], a, b ) != null ) {
	last = child[ i ] ;
	counter++ ;
}
}
if( counter == 2 ) {
	return root ;
}
if( counter == 1 ) {
	return last ;
}
return null ;
} 