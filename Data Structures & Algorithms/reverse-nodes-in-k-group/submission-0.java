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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode cur = head;
        int g =0;
        while(cur!=null && g < k)
        {
            cur  = cur.next;
            g++;
        }
        if(g == k)
        {
            cur = reverseKGroup(cur,k);
            while(g --> 0)
            {
                ListNode newn = head.next;
                head.next = cur;
                cur = head;
                head = newn;
            }
            head = cur;
        }
        return head;
    }
}
