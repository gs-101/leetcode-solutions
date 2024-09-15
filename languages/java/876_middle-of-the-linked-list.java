// See: https://leetcode.com/explore/learn/card/the-leetcode-beginners-guide/692/challenge-problems/4426/

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
    public ListNode middleNode(ListNode head) {
        ListNode middle = head; // Define a middle node
        ListNode end = head; // Define a end node

        while (end != null && end.next != null) {
            middle = middle.next;
            end = end.next.next;
        }

        return middle;
    }
}

// Time complexity: O(n)
// Space complexity: O(1)
