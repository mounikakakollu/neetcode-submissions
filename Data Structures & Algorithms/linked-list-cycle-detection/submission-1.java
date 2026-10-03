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
    public boolean hasCycle(ListNode head) {

        if (head == null || head.next == null) {
            return false;
        }

        ListNode slowPointer = head;
        ListNode fastPointer = head.next;
        while(slowPointer != null && fastPointer != null) {
            if (slowPointer == fastPointer) {
                return true;
            }
            slowPointer = slowPointer.next;

            if (fastPointer.next == null) {
                return false;
            }
            fastPointer = fastPointer.next.next;
        }
        return false;

        
    }
}
