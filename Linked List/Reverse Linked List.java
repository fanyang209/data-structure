/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode cur = head;
        while(cur != null){
            size++;
            cur = cur.next;
        }
       
        
        int index = size - n;
        ListNode pre = head;
        
        if(index == 0){
            head = head.next;
            pre.next = null;
            return head;
        }else{ 
            for(int i = 0; i < index - 1; i++){
            pre = pre.next;
        }
        
        pre.next = pre.next.next;
        
        return head;
            
        }
        
       
    }
}