/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)  return true;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // 记录第二段链表的第一个节点
        ListNode secondHead = slow.next;
        ListNode pre = secondHead;
        ListNode cur = pre.next;
        // 将第一段链表的尾巴置空
        slow.next = null;
        while(pre != null && cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        // 将第二段链表的尾巴置空
        secondHead.next = null;    
        
        while( pre != null){
            if(head.val != pre.val) return false;
            head = head.next;
            pre = pre.next;
        }
    
      return true;
    }
}