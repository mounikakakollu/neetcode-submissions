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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode currNode = head;
        while(currNode != null) {
            len++;
            currNode = currNode.next;
        }

        ListNode prevNode = null;
        currNode = head;
        int i = 0;
        if (head == null) {
            return head;
        }
        if (len-n == 0) {
            return head.next;
        }
        while(i<len-n && currNode != null) {
            prevNode = currNode;
            currNode = currNode.next;
            i++;
        }
        
        if (currNode!=null) {
            prevNode.next = currNode.next;
        }

        return head;

    }
}
