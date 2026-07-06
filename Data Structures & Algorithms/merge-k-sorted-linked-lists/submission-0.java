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
    public ListNode mergeKLists(ListNode[] lists) {
      List<Integer> n = new ArrayList<>();
      for(ListNode le : lists)
      {
        while(le!=null)
        {
            n.add(le.val);
            le = le.next;
        }
      }
      Collections.sort(n);

      ListNode r = new ListNode(0);
      ListNode c = r;
      for(int ne : n)
      {
        c.next = new ListNode(ne);
        c = c.next;
      }
      return r.next;
    }
}
