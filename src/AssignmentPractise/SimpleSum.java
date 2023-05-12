package AssignmentPractise;

import java.util.Scanner;

public class SimpleSum {


    static  void simpleSum(int a, int b , int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        simpleSum(a,b,c);
    }
}
