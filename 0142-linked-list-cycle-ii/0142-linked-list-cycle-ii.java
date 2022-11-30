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
    public ListNode detectCycle(ListNode head) {
        return hasCycle(head);
    }
    public ListNode hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        do{
            if(fast==null || fast.next==null)
            {
                return null;
            }
            slow=slow.next;
            fast=fast.next.next;
        }while(slow!=fast);
            
        slow=head;
        while(slow!=fast)
        {
            slow=slow.next;
            fast=fast.next;
        }
        
        return slow;
    }
}