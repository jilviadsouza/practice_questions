/* ReverseLinkedListII

Reverse a linked list from position m to n. Do it in one-pass.

Note: 1 ≤ m ≤ n ≤ length of list.

Example:

Input: 1->2->3->4->5->NULL, m = 2, n = 4
Output: 1->4->3->2->5->NULL


*/
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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        
        /*
        traverse the list till m 
        at m through n, reverse it 
        and connect the nodes right before n and right after m 
        */
        
        int i = 1;
        ListNode prev = null; 
        ListNode curr = head;
        ListNode next = head.next;
        
        //traversing till m
        while (i < m){
            prev = curr;
            curr = curr.next;
            i++;
        }
        
        // connection nodes
        ListNode first_connection = prev; // prev is 1, 1.next has to point to 4, which is curr after reversal
        ListNode second_connection = curr; // curr is 2, 2.next has to point to 5, which is next after the reversal
        
        //reversal of m through n
        next = curr.next;
        while(i < n){
            i++;
            curr.next = prev;
            prev = curr;
            curr = next;
            next = next.next;
        }
        curr.next = prev;
        
        //connect
        if (first_connection != null){
            first_connection.next = curr;
        } 
        
        second_connection.next = next;
        
        //for smaller cases
        if(m == 1) return curr;
        else return head;
        
    }
}