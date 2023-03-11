package LinkedList;

public class InsertNodeAtTheHead {
    public Node insertNode(Node head, int k){
        Node temp = new Node(k);
        if(head==null){
         return temp;
        }
        else{
            temp.next=head;
            return head;
        }
    }




    class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
            next = null;
        }
    }
}
