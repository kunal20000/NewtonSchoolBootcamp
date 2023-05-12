package AssignmentPractise;

import java.util.Scanner;

public class PennyandCharity {
    static int Charity(int N, int M){
//Enter your code here
        if(M>=N){
            int cloth= M/N;
            if(cloth==1){
                return -1;
            }else{
                return cloth;
            }
        }else{
            return -1;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int M = sc.nextInt();
        Charity(N,M);
    }
}
