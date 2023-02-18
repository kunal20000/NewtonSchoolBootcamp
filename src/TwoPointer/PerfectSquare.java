package TwoPointer;

import java.util.Scanner;

public class PerfectSquare {
    static boolean isPerfectSquare(int n){
        if(n>=0){
          int sr=(int) Math.sqrt(n);
          return ((sr*sr)==n);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            if(isPerfectSquare(x)){
                System.out.println("Yes");
            }else{
                System.out.println("N0");
            }
        }
    }
}
