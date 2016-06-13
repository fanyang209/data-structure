public ListNode deepCopy( ListNode head ) {
	if( head == null ) {
	return head ;
}
ListNode dummy = new ListNode( 0 ) ;
ListNode cur = dummy ;
Map< ListNode, ListNode> map = new HashMap< ListNode, ListNode>() ;
while( head != null ) {
	if( !map.containsKey( head ) ) {
	map.put( head, new ListNode( head.value ) ) ;
}
cur.next = map.get( head ) ;
if( head.forward != null ) {
	if( !map.containsKey( head.forward ) ) {
	map.put( head.forward, new ListNode( head.forward.value ) ) ;
}
cur.forward.next = map.get( head.forward) ;
}
head = head.next ;
cur = cur.next ;
}
return dummy.next ;
}