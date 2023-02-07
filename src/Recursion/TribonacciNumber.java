package Recursion;

import java.util.Scanner;

public class TribonacciNumber {
    /**
     *  f(n) = f(n-1) + f(n-2) + f(n-3)
     *
     *  f(1) = 0
     *  f(2) =0
     *  f(3) = 1
     *
     *  n = 4
     *
     *  f(4) = f(3) + f(2) + f(1) = 1
     *  f(5) = f(4) + f(3) + f(2) = 1+ 1+ 0 = 2
     *
     */

    static int tribonacciNumber(int n){
        if(n==1 || n==2){
            return 0;
        }else if(n==3) {
            return 1;
        }else{
            return tribonacciNumber(n-1)+
                    tribonacciNumber(n-2)+
                    tribonacciNumber(n-3);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(tribonacciNumber(n));

    }

}
