package Hashing;

import java.util.HashSet;
import java.util.Scanner;

public class NumberOfUniqueCharacter {
    static char getUniqueCharCount(String s){
        HashSet<Character> hs= new HashSet<>();
        for(int i=0;i<s.length();i++){
            hs.add(s.charAt(i));
        }
        return (char) hs.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n =sc.nextInt();
        System.out.println(getUniqueCharCount(s));

    }
}
