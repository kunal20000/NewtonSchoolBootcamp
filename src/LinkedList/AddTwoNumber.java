package LinkedList;

public class AddTwoNumber {


    static Node addTwoNumber(Node first , Node second,){
        Node dummy = new Node(0);
        Node curr = dummy;
        int carry = 0;

        while(first ! = null || second ! = null || carry ! =0){
            int sum = carry;

        }

    }
    static class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
}
