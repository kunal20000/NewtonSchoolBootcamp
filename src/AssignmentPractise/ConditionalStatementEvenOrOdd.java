package AssignmentPractise;

import java.util.Scanner;

public class ConditionalStatementEvenOrOdd {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N%2==0){
            System.out.println(0);
        }else{
            System.out.println(1);
        }
         sc.close();
    }
   
}
