package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //ArrayList<String> list2 = new ArrayList<String>();
        //ArrayList<Boolean> list3 = new ArrayList<Boolean>();

        //add elements
        list.add(0);
        list.add(1);
        list.add(2);
        System.out.println(list);

        //get elements
        int element = list.get(0);
        System.out.println(element);

       // add el in list
        list.add(1,9);
        System.out.println(list);


        //set elements
        list.set(0,5);
        System.out.println(list);

        // delete elements
        list.remove(1);
        System.out.println(list);

        //size
        int size = list.size();
        System.out.println(size);

        //loops
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.print(list);
    }
}
