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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;
        ListNode p=null;
        ListNode head=p;
        // System.out.println(head.val);
        
        while(list1!=null && list2!=null)
        {
            ListNode tmp=null;
            if(list1.val <= list2.val)
            {
                tmp=new ListNode(list1.val);
                list1=list1.next;
            }
            else
            {
                tmp=new ListNode(list2.val);
                list2=list2.next;
            }
            if(p==null){
                
                p=tmp;
                head=p;
            }
            else{
                p.next=tmp;
            p=tmp;
            }
        }
        while(list1!=null){
            ListNode tmp=null;
            tmp=new ListNode(list1.val);
                list1=list1.next;
            if(p==null){
                
                p=tmp;
                head=p;
            }
            else{
                p.next=tmp;
            p=tmp;
            }
            
        }
        while(list2!=null){
            ListNode tmp=null;
            tmp=new ListNode(list2.val);
                list2=list2.next;
            if(p==null){
                
                p=tmp;
                head=p;
            }
            else{
                p.next=tmp;
            p=tmp;
            }
        }
        return head;
    }
}