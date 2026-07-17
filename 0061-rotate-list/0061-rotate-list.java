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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        if (head.next == null) return head;
        int size = 1;
        ListNode count = head;
        while (count.next != null) {
            count = count.next;
            size++;
        }
        k = k % size;
        count.next = head;

        for (int i=0; i<size - k - 1; i++) head = head.next;

        ListNode temp = head.next;
        head.next = null;
        return temp;
    }
}