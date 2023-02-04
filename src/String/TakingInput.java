package String;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //if you want to take entire line of string
        String line = sc.nextLine();


        // If you want to ignore spaces and just
        // take a word before a space
        String s = sc.next();

        String t = sc.next();


        System.out.println(line);
        System.out.println(s);
        System.out.println(t);


    }
}
