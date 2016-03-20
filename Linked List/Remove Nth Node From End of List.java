/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
// slow-fast pointer 
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null) return null;
        
        ListNode fast = head;
        ListNode slow = head;
        
        // move fast pointer nth step ahead
        for(int i = 0; i < n; i++){
            fast = fast.next;
        }
        
        // if the node need to be removed is head
        if(fast == null){
            head = head.next;
            return head;
        }
        
        // move fast and slow node simultaneously until fast.next is null
        // then slow node points pre node of target node
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        // remove target node
        slow.next = slow.next.next;
        return head;
    }
}