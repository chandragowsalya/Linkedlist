// determine node from where the loop starts
// https://leetcode.com/problems/linked-list-cycle-ii/description/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // if(head == null && head.next ==null) return null;

        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            // as soon as they meet, start from head and move with same speed

            if(slow == fast){
                while(head != slow){
                    head = head.next;
                    slow = slow.next;
                }
                return slow;
            }
           
        }
        return null;

    }
}
