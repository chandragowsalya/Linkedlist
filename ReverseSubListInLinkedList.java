// 92. Reverse Linked List II

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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode();
        dummy.next= head;

        ListNode leftpre = dummy;
        ListNode currNode = head;

        // no of rows to skip l-1
        for(int i=0;i < left-1;i++){
            leftpre = leftpre.next;
            currNode = currNode.next;
        }

        // make a marker to node where we start reversing

        ListNode sublisthead = currNode;

        ListNode preNode = null;

        for(int i =0;i< right-left+1;i++){
            ListNode nextNode = currNode.next;
            currNode.next = preNode;
            preNode= currNode;
            currNode = nextNode;
        }
        leftpre.next = preNode;
        sublisthead.next = currNode;

        return dummy.next;
    }
    // return head;
}
