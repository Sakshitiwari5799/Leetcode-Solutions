class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // edge case
        if (head == null) return null;

        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                // remove duplicate
                current.next = current.next.next;
            } else {
                // move forward
                current = current.next;
            }
        }

        return head;
    }
}