// 206. Reverse Linked List

/* Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
Input: head = [1,2]
Output: [2,1]
Example 3:

Input: head = []
Output: []
*/

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
    public ListNode reverseList(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode currNode = head;

        ListNode preNode = null;
        while(currNode!=null){
            ListNode nextNode = currNode.next;
            currNode.next = preNode;
            preNode = currNode;
            currNode = nextNode;
        }

        head=preNode; // reassigning head node
        return head;
    }
}
