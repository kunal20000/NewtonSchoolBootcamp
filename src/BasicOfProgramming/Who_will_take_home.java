package BasicOfProgramming;

import java.util.Scanner;

public class Who_will_take_home {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%7==0){
            System.out.println("Steve");
        }else if(n%9==0){
            System.out.println("Chris");
        }else{
            System.out.println("William");
        }

    }
}
