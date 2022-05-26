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
        if(head==null)
            return head;
        if(head.next==null && n==1)
            return null;
        int l=0;
        ListNode p=head;
        while(p!=null)
        {
            l++;
            p=p.next;
        }
        
        int t=l-n;
        if(t==0)
        {
            // ListNode p=head;
            head=head.next;
            return head;
        }
        System.out.println(t);
        if(t>l || t<=0)
            return head;
        p=head;
        for(int i=0;i<t-1;i++)
        {
            System.out.println(p.val);
            p=p.next;
            
        }
        System.out.println(p.val);
        if(p.next!=null)
        p.next=p.next.next;
        return head;
    }
}