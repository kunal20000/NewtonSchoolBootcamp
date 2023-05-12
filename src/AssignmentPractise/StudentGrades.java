package AssignmentPractise;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        double per = ((double) (a+b+c+d+e)/500)*100;
        if(per>=80){
            System.out.println("A");
        } else if (per<80 && per>=60) {
            System.out.println("B");
        } else if (per<60 && per>=40) {
            System.out.println("C");
        }else {
            System.out.println("D");
        }

    }
}
