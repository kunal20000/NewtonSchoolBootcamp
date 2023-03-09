package LinkedList;

public class MakeItCircular {
    public static Node makeCircular(Node head){

        if(head==null){
            return head;
        }
        Node current =head;
        while(current !=null){
            current= current.next;
        }
        current.next= head;
        return head;
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
