package LinkedList;

public class MergeTwoSortedLinkedList {
   public static Node merge(Node head1, Node head2){
       Node head3 = new Node(0);
       Node ptr1 = head1;
       Node ptr2 = head2;
       Node ptr3 = head3;

       while(ptr1!= null && ptr2!= null)
       {
           if(ptr1.val<=ptr2.val)
           {
               ptr3.next=ptr1;
               ptr1=ptr1.next;
               ptr3=ptr3.next;
               ptr3.next=null;

           }
           else
           {
               ptr3.next=ptr2;
               ptr2=ptr2.next;
               ptr3=ptr3.next;
               ptr3.next=null;
           }
       }
       while(ptr1!=null)
      {
          ptr3.next=ptr2;
          ptr2=ptr2.next;
          ptr3=ptr3.next;
          ptr3.next=null;
      }
      while(ptr2!=null)
      {
          ptr3.next = ptr1;
          ptr1= ptr1.next;
          ptr3 = ptr3.next;
          ptr3.next = null;
      }
     return head3.next;


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
