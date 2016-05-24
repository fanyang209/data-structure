public ListNode partition ( ListNode head, int target ) {
	if ( head == null || head.next == null ) {
	return head ;
}
ListNode dummyHeadb = new ListNode( -1 ) ;
ListNode dummyHeads = new ListNode( -1 ) ;
ListNode cur_b = dummyHeadb ;
ListNode cur_s = dummyHeads ;

// give node to respective linked list
while ( head != null ) {
	if ( head.val <= target ) {
	cur_s.next = head ;
	cur_s = cur_s.next ;
} else {
	cur_b.next = head ;
cur_b = cur_b.next ;
}
head = head.next ;
}
cur_s.next = dummyHeadb.next ;
cur_b.next = null ;
return dummyHeads.next ;
}