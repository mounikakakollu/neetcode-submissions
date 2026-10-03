/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 * 1->1->2->4, 3->5
 *
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode resultHead = null;
        ListNode currNode = null;
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }
        while(list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                if (resultHead == null) {
                    resultHead = list1;
                    
                } else {
                    currNode.next = list1;
                }
                currNode = list1;
                list1 = list1.next;
            } else {
                if (resultHead == null) {
                    resultHead = list2;
                
                } else {
                    currNode.next = list2;
                }
                currNode = list2;
                list2 = list2.next;
            }
        }
        while(list1!= null) {
            
            currNode.next = list1;
            
            currNode = list1;
            list1 = list1.next;

        }
        while(list2!= null) {
            currNode.next = list2;
            currNode = list2;
            list2 = list2.next;

        }
        currNode.next = null;
        return resultHead;
    }
}