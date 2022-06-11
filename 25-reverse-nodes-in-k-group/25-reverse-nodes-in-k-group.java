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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null)
            return head;
        ListNode origk=head;
        ListNode z=head;
        int n=0;
        ListNode result=null;
        while(z!=null)
        {
            n++;
            z=z.next;
        }
        if(k>n)
            return head;
        // System.out.println("length "+n);
        for(int i=0;i<n;i=i+k)
        {
            int r=k-1;
            ListNode tmp=origk;
            while(r-->0)
            {
                if(tmp.next!=null)
                {
                    // System.out.println("tmp "+tmp.val);
                    tmp=tmp.next;
                }
                else
                    return result;
            }
            ListNode nextk=tmp.next;
            tmp.next=null;
            ListNode reversek=reverseList(origk);
            // System.out.println("returned "+reversek.val);
            tmp=reversek;
            while(tmp.next!=null)
                tmp=tmp.next;
            tmp.next=nextk;
            
            if(result==null)
            {
                result=reversek;
            }
            else
            {
                tmp=result;
                while(tmp.next!=origk)
                {
                    tmp=tmp.next;
                    // System.out.println("result "+tmp.val);
                }
                tmp.next=reversek;
//                 tmp=reversek;
//                 while(tmp.next!=null){
                    
//                     tmp=tmp.next;
//                     System.out.println("reverse "+tmp.val);
//                 }
//                 tmp.next=nextk;
            }
            origk=nextk;
        }
        return result;
    }
}