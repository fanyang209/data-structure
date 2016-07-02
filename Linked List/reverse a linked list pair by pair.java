public ListNode reverse( ListNode head ) {
	// base case
	if( head.next == null || head == null ) {
		return head;
}
// recursive rule
ListNode newHead= head.next ;
head.next = reverse( head.next.next ) ;
newHead.next = head ;
return newHead ;
}