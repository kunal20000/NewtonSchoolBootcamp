package Hashing;

import javax.imageio.stream.ImageInputStream;
import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    /**
     * Write a function which takes an array as input,
     * and print the count of each element of this array.
     *
     * example: 1,3,1,2,3,3,3,2
     *
     * Output:
     * 1: 2
     * 2: 2
     * 3: 4
     * key -> Value
     *
     * 1,3,1,2,3,3,3,2,5
     * {
     *     1 -> 2
     *     3 -> 4
     *     2-> 2
     *     5 -> 1
     * }
     */

    static void printCount(int[] arr){
        HashMap<Integer, Integer> hm =
                        new HashMap<>();
        for(int el:arr){
            if(hm.containsKey(el)){
                hm.put(el, hm.get(el) +  1);
            }else{
                hm.put(el,1);
            }
        }
        for(Map.Entry<Integer, Integer> et : hm.entrySet()){
            System.out.println(et.getKey() +"->"+et.getValue());
        }

    }

    public static void main(String[] args) {
        printCount(new int[]{1,3,1,2,3,3,3,2,5});
    }
}
