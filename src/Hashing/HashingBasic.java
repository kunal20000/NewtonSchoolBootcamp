package Hashing;

import java.util.HashMap;

public class HashingBasic {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        //adding element to the map;
        // using std put method;
        map.put("kunal", 10);
        map.put("shubham", 20);
        map.put("ujjwal", 30);
        map.put("aswath", 40);

        //print the total size
        System.out.println(map.size());
        // printing elements in object of map
        System.out.println(map);
        //checking key is present or not

        if(map.containsKey("ujjwal")){
            //mapping
           Integer a = map.get("ujjwal");

           // // Printing value for the corresponding key
            System.out.println(a);
        }

    }
}



