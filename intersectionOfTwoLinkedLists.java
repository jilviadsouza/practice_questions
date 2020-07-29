// intersectionOfTwoLinkedLists
/*
Write a program to find the node at which the intersection of two singly linked lists begins.
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       
        if(headA == null || headB == null) return null;
        
        ListNode aptr = headA;
        ListNode bptr = headB;
        
        while (aptr != bptr){
            
            if(aptr == null){
                aptr = headB;
            } else {
                aptr = aptr.next;
            }
            
            if(bptr == null){
                bptr = headA;
            } else {
                bptr = bptr.next; 
            }
        }
        //when aptr == bptr, return either one of them, and since they are both equal, that is the intersection node!
        return aptr;
        
    }
}