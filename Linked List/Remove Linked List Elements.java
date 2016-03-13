/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        ListNode cur = head;
         ListNode dummyHead  = new ListNode(1);
         ListNode pre = dummyHead;
         pre.next = cur;
  
        while(cur!= null){
              if(cur.val == val){
                    pre.next = cur.next;
              }else{
                  pre = pre.next;
                  
              }
        
           cur = cur.next;
        }
        
        return dummyHead.next;
        
    }
}