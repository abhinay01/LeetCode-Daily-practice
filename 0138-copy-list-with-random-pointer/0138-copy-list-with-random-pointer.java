/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node newhead=null,p=head,k=null;
        while(p!=null)
        {
            Node temp=new Node(p.val);
            Node r=p.next;
            p.next=temp;
            temp.next=r;
            p=r;
            
        }
        p=head;
        while(p!=null)
        {
            Node t=p.next;
            if(p.random!=null)
            t.random=p.random.next;
            else
                t.random=null;
            p=p.next.next;
        }
        p=head;
        while(p!=null)
        {
            if(newhead==null)
            {
                newhead=p.next;
                p.next=newhead.next;;
                p=newhead.next;
                k=newhead;
            }
            else
            {
                Node t=p.next;
                k.next=t;
                p.next=t.next;;
                p=t.next;
                k=t;
            }
        }
        return newhead;
    }
}