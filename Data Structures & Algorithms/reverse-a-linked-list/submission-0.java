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
        ListNode temp;
        if(head == null || head.next == null) {
            return head;
        }

        ListNode first = head, second = first.next, third = second.next;
        while(third != null) {
            second.next = first;
            
            temp = third.next;

            first = second;
            second = third;
            third = temp;
        }

        second.next = first;
        head.next = null;
        return second;

    }
}
