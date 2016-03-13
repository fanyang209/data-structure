/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode pre = head;
        ListNode cur = pre.next;
        ListNode next;
        
        while(cur != null){
              next = cur.next;
            if(pre.val == cur.val){
              pre.next = next;  
              cur = next;
            }else{
                 pre = cur;
                 cur = next;
            }
        }
        return head;
    }
}