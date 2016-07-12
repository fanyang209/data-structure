public TreeNode merge( List<TreeNode> lists ) {
	if( lists == null ) {
	return null ;
}
TreeNode dummy = new TreeNode( 0 ) ;
TreeNode cur = dummy ;
PriorityQueue<TreeNode> minHeap = new PriorityQueue<TreeNode>( 11, new Mycomparator() ) ;
for( TreeNode node : lists ) {
	minHeap.offer( node ) ;
}
while( !minHeap.isEmpty() ) {
	cur.next = minHeap.poll() ;
	if( cur.next.next != null ) {
		minHeap.offer( cur.next.next ) ;
}
cur = cur.next ;
}
return dummy.next ;
}