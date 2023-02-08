package ModuleContest;

import java.util.Scanner;

public class IncreasingDigits {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(x>=y){
                System.out.println(y);
            }else{
                System.out.println(x);
            }
        }
    }


}
