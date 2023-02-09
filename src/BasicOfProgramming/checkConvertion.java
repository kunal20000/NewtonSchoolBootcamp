package BasicOfProgramming;

import java.util.Scanner;

public class checkConvertion {
    static String checkConvertion(int n){
        return Integer.toString(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checkConvertion(n));

    }
}
