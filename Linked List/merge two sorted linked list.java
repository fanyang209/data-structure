public ListNode mergeLinkedlist ( ListNode head1, ListNode head2 ) {
	if ( head1 == null ) {
	return head2 ;
}
if ( head2 == null ) {
	return head1 ;
}

ListNode dummyHead = new ListNode( -1 ) ;
ListNode cur = dummyHead ;
while ( head1 != null && head2 != null ) {
	if ( head1.val <= head2.val ) {
	cur.next = head1 ;
	head1 = head1.next ;
} else {
	cur.next = head2 ;
	head2 = head2.next ;
}
cur = cur.next ;
}
if( head1 != null ) {
	cur.next = head1;
}
if ( head2 != null ) {
	cur.next = head2 ;
}
return dummyHead ;
}