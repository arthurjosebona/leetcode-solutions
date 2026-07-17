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
    ListNode actual = new ListNode();
    ListNode list1;
    ListNode list2;
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        this.list1 = list1;
        this.list2 = list2;
        ListNode head = actual;
        mergeLists();
        return head.next;
    }

    private void mergeLists() {
        while (!isFullyMerged()) {
            verifySmallestAndSave();
        }
    }

    private void verifySmallestAndSave() {
        if ((list2 == null && list1 != null) || (list1 != null && list1.val <= list2.val)) {
            saveList1Node();
        } 
        if ((list1 == null && list2 != null) || (list2 != null && list1.val > list2.val)) {
            saveList2Node();
        }

    }

    private void saveList1Node() {
        actual.next = new ListNode(list1.val);
        actual = actual.next;
        list1 = list1.next;
    }

    private void saveList2Node() {
        actual.next = new ListNode(list2.val);
        actual = actual.next;
        list2 = list2.next;
    }

    private boolean isFullyMerged() {
        if (list1 == null && list2 == null) {
            return true;
        }
        return false;
    }
}