// deleteNodeInALinkedList
/*
Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        
      node.val = node.next.val; // replicate the node value
      node.next = node.next.next; // skip that replicated value
        
    }
}