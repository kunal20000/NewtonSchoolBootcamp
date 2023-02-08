package ModuleContest;

import java.util.Scanner;

public class CakeBet {
    public static void main (String[] args) {
        // Your code here
        Scanner sc =new Scanner(System.in);
        int  T=sc.nextInt();
        for(int i=0;i<T;i++){
            int a=sc.nextInt();
            if(a==6){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
