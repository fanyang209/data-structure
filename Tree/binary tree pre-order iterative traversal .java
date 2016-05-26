public List< Integer > preOrder( TreeNode root ) {
	List< Integer > preorder = new ArrayList< Integer >() ;
	if ( root == null ) {
	return preorder ;
}
Stack stack = new Stack() ;
stack.push( root ) ;
while ( !stack.isEmpty() ) {
	TreeNode  cur = stack.pop() ;
	if ( cur.right != null ) {
	stack.push ( cur.right ) ;
}

if ( cur.left != null ) {
	stack.push ( cur.left ) ;
}
preorder.add( cur.val ) ;
}
return preorder ;
}