public TreeNode maxDiff( TreeNode root ) {
	if( root == null ) {
	return null ;
}
TreeNode[ ] node = new TreeNode[ 1 ] ;
int[ ] diff = new int[ 1 ] ;
diff[ 0 ] = -1 ;
numNodes( root, node, diff ) ;
return node[ 0 ] ; 
}
public int numNodes( TreeNode root, TreeNode[ ] node, int[ ] diff ) {
	if( root == null ) {
	return 0 ;
}
int leftNum = numNodes( root.left, node, diff ) ;
int rightNum = numNodes( root.right, node, diff ) ;
if ( Math.abs( leftNum - righNum ) > diff[ 0 ] ) {
	node[ 0 ] = root ;
	diff[ 0 ] = Math.abs( leftNum - righNum ) ;
}
return leftNum  +　rightNum + 1 ;
}