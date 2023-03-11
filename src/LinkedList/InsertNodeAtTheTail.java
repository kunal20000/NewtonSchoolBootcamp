package LinkedList;

public class InsertNodeAtTheTail {
    public static Node InsertTail(Node head, int k){
        Node temp = new Node(k);
        if(head == null){
            return temp;

        }else{
           Node ptr = head;
           while(ptr.next!=null){
               ptr= ptr.next;
           }
           ptr.next = temp;
           return head;
        }
    }



    static class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
            next = null;
        }
    }
}
