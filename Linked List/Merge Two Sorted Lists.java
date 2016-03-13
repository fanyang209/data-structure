/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        ListNode fakeNode = new ListNode(-1);
        ListNode newNode = fakeNode;
        
        while( l1 != null  && l2 != null){
            if(l1.val < l2.val){
                newNode.next = l1;
                l1 = l1.next;
                newNode = newNode.next;
                
            }else {
                   newNode.next = l2;
                   l2 = l2.next;
                   newNode = newNode.next;
            }             
        }
        
        if(l1 != null){
            newNode.next = l1;
        }
        
         if(l2 != null){
           newNode.next = l2;
        }
        
        return fakeNode.next;
    }
}