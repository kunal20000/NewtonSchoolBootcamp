package AssignmentPractise;

import java.util.Scanner;

public class isLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year%400==0){
            System.out.println("YES");
        }else if(year%100==0){
            System.out.println("NO");
        }else if(year%4==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
