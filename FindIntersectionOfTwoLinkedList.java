// 160. Intersection of Two Linked Lists

/* Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
Output: Intersected at '8'
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = getListLength(headA);
        int lenB = getListLength(headB);

       // if len A is larger decrement that
        while(lenA > lenB){
            lenA--;
            headA = headA.next;
        }
// if len B is larger than len A , decrement that to match len A
        while(lenB>lenA){
            lenB--;
            headB= headB.next;
        }
// increment until head A and head B matches
        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;

    }
    private int getListLength(ListNode head){
        int len =0;
        while(head != null){
            len++;
            head = head.next;
        }
        return len;
    }
}
