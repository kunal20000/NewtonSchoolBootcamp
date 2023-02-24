package Recursion;

import java.util.Scanner;

public class StaircaseCount {

    static int countOfWaysStaircase(int n){
        if(n==0){
            return 1;

        }else{
          return countOfWaysStaircase(n-1) + countOfWaysStaircase(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n= sc.nextInt();
         System.out.print(countOfWaysStaircase(n));
    }
}
