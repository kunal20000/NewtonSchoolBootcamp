package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Basic {
    public static void main(String[] args) {
        // created object of queue
        Queue<Integer> ks = new LinkedList<Integer>();

        // add numbers to end queue

        ks.add(17363);
        ks.add(71826);

        //print queue
        System.out.println(ks);

        //print head and delete the head

        System.out.println(ks.poll());

        System.out.println(ks.poll());


    }
}
