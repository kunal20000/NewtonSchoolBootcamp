package BasicOfProgramming;

import java.util.Scanner;

public class Good_Sum {

    public static void main (String[] args) {
        // Your code here
      Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();


            if(x+y>8){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }
    }
}
