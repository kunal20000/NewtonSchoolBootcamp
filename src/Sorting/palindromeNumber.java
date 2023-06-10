package Sorting;

import java.util.Scanner;

public class palindromeNumber {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int temp;
        int reaminder;
        temp = n;
        while (n > 0) {
            reaminder = n % 10;// getting reaminder
            sum = (sum * 10 + reaminder);
            n = n / 10;
        }
        if (temp == sum)
        {
            System.out.print("YES");
        } else
        {
            System.out.print("NO");
        }

    }
}
