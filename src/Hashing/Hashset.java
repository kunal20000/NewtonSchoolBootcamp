package Hashing;

import java.util.HashSet;

public class Hashset {
    /**
     * Write a function that takes an array of integers arr,
     * and an array of queries queries.
     *
     * Return a boolean array with each element  at index i
     * true-> if query[i] exists in arr
     * false -> if query[i] does not exists in arr.
     *
     * example:
     * arr = 1 9 31 2 31 56 91
     * queries = 31 9 44 51 7  n queries
     *
     * answer=  T T F F F
     *
     * Assuming n elements and n queries.
     * Approach 1: Linear search ->   O(n) * O(n) -> O(n^2)
     *
     * Approach 2: Binary search -> O(logn) * O(n) -> O(n log n)
     *
     * Approach 3: Hashing -> O(1) * (n) -> O ( n)
     */

    static boolean[] queryElements(int[] arr, int[] quries){
        boolean[] res = new boolean[arr.length];
        HashSet<Integer> hs  = new HashSet<>();
        for(int el:arr){
            hs.add(el);
        }
        for(int j=0;j<quries.length;j++){
            res[j]= hs.contains(quries[j]);
        }
        return res;
    }

    public static void main(String[] args) {
        queryElements(new int[]{1,9,31,2,31,56,91},
                new int[]{31,9,44,51,7});
    }

    /**
     * Given an array of integers.
     * Write a function which returns the count of unique integers
     * in this array.
     *
     * example: 1,5,7,1,4,5,5,5,5,5,5,5,5,5,5,5,5,9
     * Output: 5
     * */

    static int countUniqueIntegerInArray(int[] arr){
        HashSet<Integer> kk =  new HashSet<>();
        for(int el:arr){
            kk.add(el);
        }
        return kk.size();



    }
}
