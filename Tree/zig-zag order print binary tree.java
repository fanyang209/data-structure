public List<Integer> zigzagLayerByLayer( TreeNode root ) {
	List<Integer> list = new LinkedList<Integer>() ;
	if( root == null ) {
	return list ;
}
Deque<TreeNode> deque = new LinkedList<TreeNode>() ;
deque.offerFirst( root ) ;
int layer = 0 ;
while( !deque.isEmpty() ) {
	int size = deque.size() ;
	for( int i = 0; i < size; i++ ) {
	if( layer == 0 ) {
	TreeNode cur = deque.pollLast() ;
	list.add( cur.key ) ;
	if( cur.right != null ) {
	deque.offerFirst( cur.right ) ;
}
if( cur.left != null ) {
	deque.offerFirst( cur.left ) ;
}
} else {
	TreeNode cur = deque.pollFirst() ;
	list.add( cur.key ) ;
	if( cur.right != null ) {
	deque.offerLast( cur.right ) ;
}
if( cur.left != null ) {
	deque.offerLast( cur.left ) ;
}

}
}
layer = 1 - layer ;
}
return list ;
}