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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head,p=head;
        int r=0;
        if(head==null)
            return head;
        if(head.next==null)
        {
            if(n==1)
                return null;
            else
               return head;
        }
        for(int i=0;i<n;i++)
        {
            temp=temp.next;
            // n--;
        }
        if(temp==null)
            return head.next;
        while(temp.next!=null)
        {
            temp=temp.next;
            p=p.next;
        }
        p.next=p.next.next;
        return head;
    }
}