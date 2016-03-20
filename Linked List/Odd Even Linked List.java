/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
// use fake odd and fake even node to be the first node of each list
// iterate the original list, if it is odd, add to odd list, otherwise
// add to even list. after iteration append first real even node to the
// tail of odd node. return odd.next, which is the the first real odd node 
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return null;
        else if(head.next == null) return head;
        
        ListNode odd = new ListNode(0);
        ListNode even = new ListNode(0);
        ListNode oddCur = odd;
        ListNode evenCur = even;
        
        int count = 0;
        ListNode temp = head;
        while(temp != null){
            count++;
            if(count % 2 != 0){
                oddCur.next = new ListNode(temp.val);
                oddCur = oddCur.next;
            }else{
                evenCur.next = new ListNode(temp.val);
                evenCur = evenCur.next;
            }
            temp = temp.next;
        }
       oddCur.next = even.next;
       return odd.next;
    }
}