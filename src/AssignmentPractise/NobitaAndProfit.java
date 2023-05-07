package AssignmentPractise;

import java.util.Scanner;

public class NobitaAndProfit {
    static void Profit(int C, int S){

        System.out.println(S-C);


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int S = sc.nextInt();
        Profit(C,S);
    }
}
