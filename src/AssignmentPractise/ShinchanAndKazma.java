package AssignmentPractise;

import java.util.Scanner;

public class ShinchanAndKazma {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int S = sc.nextInt();

        int D =A-B;
        if(D<0){
            D=-D;
        }
        int time = D/S;
        System.out.println(time);

    }
}
