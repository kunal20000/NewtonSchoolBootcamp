package LinkedList;

public class InsertNodeAtGivenPosition {
    public static Node addElement(Node head, int k , int pos){
        Node temp = new Node(k);

        if(pos==1){
            temp.next = head;
            return temp;
        }
        Node prev = null;
        Node curr = head;
        for(int i=1;i<pos;i++){
            prev=curr;
            curr= curr.next;
        }
        prev.next = temp;
        temp.next=curr;
        return head;


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
