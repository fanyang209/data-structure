/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 // http://blog.csdn.net/linhuanmars/article/details/24613781
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prenode = dummy;
        int i = 1;
        while(prenode.next != null && i < m){
            prenode = prenode.next;
            i++;
        }
        if(i < m) return head;
        ListNode mnode = prenode.next;
        ListNode cur = mnode.next;
        while(cur != null && i < n){
            ListNode next = cur.next;
            cur.next = prenode.next;
            prenode.next = cur;
            mnode.next = next;
            cur = next;
            i++;
        }
        return dummy.next;
    }
}