public ListNode insert ( ListNode head, int target) {
	ListNode newNode = new ListNode( target ) ;
	// determine if the inserted node is before head
	if ( head == null || head.val >= target ) {
	newNode.next = head ;
	return newNode ;
}

ListNode cur = head ;
while ( cur.next != null && cur.next.val < target ) {
	cur = cur.next ;
}
newNode.next = cur.next ;
cur.next = newNode ;
return head ;
}