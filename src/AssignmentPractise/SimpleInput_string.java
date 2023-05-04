package AssignmentPractise;

import java.util.Scanner;

public class SimpleInput_string {
    static void printString(String stringVariable){
        /* Write your code here*/
        System.out.println(stringVariable);
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String s = sc.nextLine();
        printString(s);
    }
}
