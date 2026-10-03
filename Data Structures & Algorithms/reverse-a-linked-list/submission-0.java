/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 * 2->3->4->5->6->null
 * 2-> null currNode3->4->5->6->null
 * 3->2->null, currNode 4
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode resHead = null;
        while(head != null) {
           ListNode tmp = head.next;  
           head.next = resHead; 
           resHead = head; 
           head = tmp;
        }
        return resHead;
        
    }
}
