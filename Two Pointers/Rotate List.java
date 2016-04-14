/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null ) return head;
        
        ListNode fast = head, slow = head, countlen = head;
        int len = 0;
        
        while(countlen != null){
            len++;
            countlen = countlen.next;
        }
        
        k = k % len;
        if(k == 0) return head;
        
        for(int i = 0; i < k; i++){
            fast = fast.next;
        }
        
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        
        ListNode newhead = slow.next;
        fast.next = head;
        slow.next = null;
        return newhead;
    }
}