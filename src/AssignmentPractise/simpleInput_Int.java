package AssignmentPractise;

import java.util.Scanner;

public class simpleInput_Int {
    static void printInteger(int N){
        /* Write Your Code Here*/
        System.out.println(N);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printInteger(n);
    }
}
