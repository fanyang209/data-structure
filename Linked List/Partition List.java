/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null) return head;
        
        ListNode small = new ListNode(-1);
        ListNode big = new ListNode(-1);
        ListNode newsmallhead = small;
        ListNode newbighead = big;
        
        while(head != null){
            if(head.val < x){
                small.next = head;
                small = small.next;
            }else{
                big.next = head;
                big = big.next;
            }
            head = head.next;
        }
        big.next = null;
        
        small.next = newbighead.next;
        return newsmallhead.next;
    }
}