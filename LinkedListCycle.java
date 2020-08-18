// LinkedListCycle
/*
Given a linked list, determine if it has a cycle in it.

To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.

*/

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
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        if(head == null || head.next == null){
            return false;
        }
        
        ListNode slow = head;
        ListNode fast = head.next;
        
        while(slow != fast){
            if(fast == null || fast.next == null){
                return false;
            }
            
            slow = slow.next;
            fast = fast.next.next;
        }
        // if slow == false
        return true;
    }
}