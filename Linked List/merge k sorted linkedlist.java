public ListNode merge( List<ListNode> listOfLists ) {
		PriorityQueue<ListNode> minHeap = new PriorityQueue<ListNode>( 11, new myComparator() ) ;
		ListNode dummy = new ListNode( 0 ) ;
		ListNode cur = dummy ;
		for( ListNode node : listOfLists ) {
		if( node != null ) {
	minHeap.offer( node ) ;
}
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

static class myComparator implements Comparator<ListNode> {
	public int compare( ListNode o1, ListNode o2 ) {
		if( o1.value == o2.value ) {
	return 0 ;
}
return o1.value < o2.value ? -1 : 1 ;
}
}