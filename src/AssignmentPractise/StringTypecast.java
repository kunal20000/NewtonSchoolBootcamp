package AssignmentPractise;

import java.util.Scanner;

public class StringTypecast {
    static String checkConevrtion(int a){
        return Integer.toString(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        checkConevrtion(n);
    }
}
