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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode head=null,p=null;
        while(l1!=null && l2!=null)
        {
            ListNode t=new ListNode();
            int sum= carry+l1.val+l2.val;
            if(sum>=10)
                carry=sum/10;
            else
                carry=0;
            t.val=sum%10;
            if(head==null){
                head=t;
                p=t;
            }
            else
            {
                p.next=t;
                p=t;
            }
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null)
        {
            int sum= carry+l1.val;
            if(sum>=10)
                carry=sum/10;
            else
                carry=0;
            int val=sum%10;
            ListNode t=new ListNode(val);
            p.next=t;
            p=t;
            l1=l1.next;
            // l2=l2.next;
        }
        while(l2!=null)
        {
            int sum= carry+l2.val;
            if(sum>=10)
                carry=sum/10;
            else
                carry=0;
            int val=sum%10;
            ListNode t=new ListNode(val);
            p.next=t;
            p=t;
            // l1=l1.next;
            l2=l2.next;
        }
        if(carry==1)
        { 
            ListNode t=new ListNode(carry);
            carry=0;
            p.next=t;
            p=t;
            // l1=l1.next;
            // l2=l2.next;
        }
        return head;
    }
}