package BasicOfProgramming;

import java.util.Scanner;

public class Make_Triangle {
    public static void main (String[] args) {
        // Your code here
        int rows; int count=1; int star =0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+ " ");
                count++;
            }
            System.out.print("\n");
        }
    }
}
