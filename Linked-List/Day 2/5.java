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
class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null; // Return null if there is no cycle
        }

        ListNode hare = head;
        ListNode tortoise = head;

        // First step: Determine if a cycle exists
        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            tortoise = tortoise.next;
            if (hare == tortoise) { // Cycle detected
                // Second step: Find the start of the cycle
                tortoise = head;
                while (tortoise != hare) {
                    tortoise = tortoise.next;
                    hare = hare.next;
                }
                return hare; // or return tortoise, as both are now at the cycle 
            }
        }

        return null; // No cycle found
    }
}
