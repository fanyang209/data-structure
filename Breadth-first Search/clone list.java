public ListNode cloneList(ListNode head ) {
          	if( head == null || head.next == null ) {
                         	return head ;
}
Map< ListNode , ListNode > map = new HashMap< ListNode , ListNode > () ;
ListNode dummy = new ListNode( 0 ) ;
ListNode cur = dummy ;
while( head != null ) {
          	if( !map.conatinsKey( head ) ) {
                         	map.put( head, new ListNode( head.val ) ) ;
}
cur.next = map.get( head ) ;
                   	if( head.forward != null ) {
if( !map.containsKey( head.forward ) ) {
          	map.put( head.forward, new ListNode( head.forward.val ) ) ;
}
cur.next.forward = map.get( head.forward ) ;
          	   	}
head = head.next ;
cur = cur.next ;
}
return dummy.next ;
}