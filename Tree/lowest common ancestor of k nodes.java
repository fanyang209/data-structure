public TreeNode LCA( TreeNode root , List<TreeNode> nodes ) {
	// base case
	if( root == null ) {
		return null ;
}
for( TreeNode node : nodes ) {
	if( root == node ) {
return root ;
}
}

// recursive rule 
TreeNode ll = LCA( root.left, nodes ) ;
TreeNode lr = LCA( root.right, nodes ) ;
if( ll != null && lr != null ) {
	return root ;
}
return ll != null ? ll : lr ;
}