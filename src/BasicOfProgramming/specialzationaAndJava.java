package BasicOfProgramming;

import java.util.Scanner;

public class specialzationaAndJava {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n<70){
            System.out.println("Newton is not eligible for any of the specialization and hons. program");
        }else if(n>=70 && n<=80){
          System.out.println("Newton is eligible for the specialization but not eligible for hons. program");
        }else if(n>=80){
            System.out.println("Newton is eligible for both the specialization and hons. program");
        }
    }
}
