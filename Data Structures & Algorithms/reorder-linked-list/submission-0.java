/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode s = slow.next;
        slow.next = null;
        ListNode prev = null;
        while(s!=null)
        {
            ListNode newn = s.next;
            s.next  = prev;
            prev = s;
            s=newn;
        }
        ListNode f = head;
        s = prev;
        while(s!=null)
        {
            ListNode t1 = f.next;
            ListNode t2 = s.next;
            f.next = s;
            s.next = t1;
            f = t1;
            s = t2;
        }
    }
}
