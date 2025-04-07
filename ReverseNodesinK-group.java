// 25. Reverse Nodes in k-Group

/* Input: head = [1,2,3,4,5], k = 3
Output: [3,2,1,4,5]

Input: head = [1,2,3,4,5], k = 2
Output: [2,1,4,3,5]
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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prevNode = null;
        ListNode nextNode;

        while(temp !=null){
            ListNode kNode = findKnode(temp,k);
            if(kNode == null){
                if(prevNode != null){
                    prevNode.next=temp;
                    break;
                }
            }
            else{
                nextNode = kNode.next;
                kNode.next=null;
                reverseLinkedList(temp);
                if(temp == head) head = kNode;
                
                else
                 prevNode.next = kNode;
            
            prevNode = temp;
            temp = nextNode;
            }
        }
        return head;

    }
    public ListNode reverseLinkedList(ListNode head){
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
    public ListNode findKnode(ListNode temp, int k){
        ListNode kNode;
        k=k-1;
        while(temp!=null && k>0){
            temp = temp.next;
            k--;
        }
        // kNode = temp;
        return temp;
    }
}
