package LinkedList;

public class DeleteEvenNodeFromTheList {
    static Node deleteEven(Node head){
        if(head==null){
            return null;
        }
        Node start = head;
        Node prev = null;
        Node current = head;
        do{
            if(current.data %2==0){
                if(current==start){
                    start = start.next;
                }
                prev.next = current.next;
                current = current.next;
            }else{
                prev = current;
                current = current.next;
            }
        }
        while(current!= start){
            return start;
        }
    }
    static class Node {
        Node next;
        int data;

        Node(int val) {
            this.data = val;
            next = null;
        }
    }

}
