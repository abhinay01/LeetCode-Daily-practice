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
    public void reorderList(ListNode head) {
        if(head==null)
            return ;
        Stack<ListNode> st=new Stack<>();
        ListNode p=head;
        int length=0;
        while(p!=null)
        {
            st.push(p);
            p=p.next;
            length++;
        }
        p=head.next;
        for(int i=0;i<length/2;i++)
        {
            ListNode tmp=null;
            if(!st.isEmpty() && st.peek()!=null)
            {
                tmp=st.pop();
            }
            head.next=tmp;
            if(tmp==p)
            {
                tmp.next=null;
                return;
            }
            tmp.next=p;
            head=p;
            p=head.next;
        }
        head.next=null;
    }
}