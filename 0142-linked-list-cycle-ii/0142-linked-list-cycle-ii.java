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
        int cycle=1;
        do{
            if(fast==null || fast.next==null)
            {
                cycle=0;
                break;
            }
            slow=slow.next;
            fast=fast.next.next;
        }while(slow!=fast);
        if(cycle==0)
            return null;
        slow=head;
        while(slow!=fast)
        {
            slow=slow.next;
            fast=fast.next;
        }
        
        return slow;
    }
}