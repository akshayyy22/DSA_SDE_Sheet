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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        // To Find the Middle Element
        ListNode Hare = head;
        ListNode Tortoise = head;
        while(Hare != null && Hare.next != null){
            Hare = Hare.next.next;
            Tortoise = Tortoise.next;
        }
        
        // To reverse the list from the middle to the last
        ListNode PrevNode = null;
        ListNode CurrNode = Tortoise;
        while (CurrNode != null){
            ListNode NextNode = CurrNode.next;
            CurrNode.next = PrevNode;
            PrevNode = CurrNode;
            CurrNode = NextNode;
        }

        ListNode FirstHalf = head;
        ListNode SecondHalf = PrevNode;
        while(SecondHalf != null){
            if(FirstHalf.val != SecondHalf.val){
                return false;
            }
            FirstHalf = FirstHalf.next;
            SecondHalf = SecondHalf.next;
        }
        return true;


    }
}
