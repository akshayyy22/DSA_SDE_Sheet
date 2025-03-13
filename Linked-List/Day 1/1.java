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
        if(head == null || head.next == null){
            return head;
        }

        ListNode PrevNode = null;
        ListNode CurrNode = head;
        while (CurrNode != null){
            ListNode NextNode = CurrNode.next;
            CurrNode.next = PrevNode;
            PrevNode = CurrNode;
            CurrNode = NextNode;
        }
        return PrevNode;

    }
}
