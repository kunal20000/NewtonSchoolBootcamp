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
            reaminder = n % 10;// for taking last digit of number
            sum = (sum * 10 + reaminder);
            n = n / 10; // it will give updated value like num is 123 reminder 3 and updated value is 12 then again same cycle
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
// time complexity is O(logn);
// space complexity is O(logn);
