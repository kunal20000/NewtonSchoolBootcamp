package LinkedList;

import org.w3c.dom.Node;

public class DeleteMiddleElement {
    public  static Node deleteMiddleElement(Node head){
        if(head.next==null){
            head.val=-1;
        }else{
            Node prev ,slow, fast;
            prev=null;
            slow=head;
            fast=head;
            while(fast!=null && fast.next!=null){
                prev=slow;
                slow=slow.next;
                fast=fast.next.next;
            }
            prev.next = slow.next;
            slow.next=null;
        }
        return head;
    }

    static class Node{
        int val;
        Node next;

    }

}
