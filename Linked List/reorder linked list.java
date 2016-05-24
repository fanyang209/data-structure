public ListNode reorder ( ListNode head ) {
	if ( head == null || head.next == null ) {
	return head ;
}
// find the middle of linked list
ListNode mid = middleNode( head ) ;
ListNode one = head ;
ListNode two = mid.next ;

// de-link the second half from the list
mid.next = null ;

// reverse second linked list
ListNode reverseNode = reverse( two ) ;

// merge the two halves
return merge( one, reversNode ) ;

}

public ListNode middleNode( ListNode head ) {
	ListNode slow = head ;
ListNode fast = head ;
ListNode secondHead ;
while ( fast.next != null && fast.next.next != null ) {
	slow = slow.next ;
	fast = fast.next.next ;
}
secondHead.next = slow.next ;
slow.next = null ;

	return slow ;
}

public ListNode reverse( ListNode head ) {
	if ( head == null || head.next == null ) {
	return head ;
}

ListNode next = head.next ;
ListNode newHead = reverse( next ) ;

next.next = head ;
head.next = null ;
return newHead ;
}

public ListNode merge ( ListNode one, ListNode two ) {
	ListNode dummyHead = new ListNode( -1 ) ;
	ListNode cur = dummyHead ;
	while ( one != null && two != null ) {
	if ( one.val <= two.val ) {
	cur.next = one ;
	one = one.next ;
} else {
	cur.next = two ;
	two = two.next ;
}

	cur.next = one ;
	one = one.next ;
	cur.next.next = two ;
	two = two.next ;
	cur = cur.next.next ;
}
if ( one != null ) {
	cur.next = one ;
}
if ( two != null ) {
	cur.next = two ;
}
return dummyHead.next ;
}