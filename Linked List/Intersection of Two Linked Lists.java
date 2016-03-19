/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
//  if headA goes to the end of list, connect it to headB, the
//  same as headB, the two nodes will eventually meet at a certain point
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        
        ListNode pa = headA;
        ListNode pb = headB;
        
         ListNode tailA = null;
         ListNode tailB = null;
         
         while(true){
             
             if(pa == null){
                 pa = headB;
             }
             
              if(pb == null){
                 pb = headA;
             }
             
              if(pa.next == null){
                 tailA = pa;
             }
             
             if(pb.next == null){
                 tailB = pb;
             }
             
             if(tailA != null && tailB != null && tailA != tailB)
             return null;
             
             if(pa == pb)
             return pa;
             
             pa = pa.next;
             pb = pb.next;
         }
    }
}