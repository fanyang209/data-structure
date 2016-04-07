/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null; //遇到null了，说明不存在环
        ListNode fast = head;
        ListNode slow = head;
        
        while(true){
            if(fast == null ||fast.next == null) return null;
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) break; //第一次相遇在Z点
        }
        
        slow = head; //slow从头开始走，
        while(slow != fast){  //二者相遇在Y点，则退出
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}