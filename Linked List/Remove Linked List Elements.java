/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
// use a fake node to be the first node of the list, two pointer to
// track the previous node and current node, iterate the list to find
// the node whose val is the same as given val
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