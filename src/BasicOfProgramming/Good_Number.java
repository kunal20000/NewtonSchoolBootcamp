package BasicOfProgramming;

import java.util.Scanner;

public class Good_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int countFact = countFact(n);
        boolean isPrimeCount = isPrime(countFact);
        if(isPrimeCount){
            System.out.println("true");

        }else{
            System.out.println("false");
        }

    }

    public static int countFact(int num){
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
