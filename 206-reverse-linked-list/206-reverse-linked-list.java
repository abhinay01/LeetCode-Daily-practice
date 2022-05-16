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
        if((head==null)|| (head.next==null))
            return head;
       return reverse(null,head,head.next);
    }
    public ListNode reverse(ListNode prev,ListNode head,ListNode next) {
        if(next==null)
        {
            head.next=prev;
            return head;
        }
        head.next=prev;
        return reverse(head,next,next.next);
    }
}