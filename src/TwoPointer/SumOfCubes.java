package TwoPointer;

import java.util.Scanner;

public class SumOfCubes {
    static boolean sumOfCubes(long n){
        long low=1;
        long high=(long) Math.cbrt(n);
        while(low<=high){
            long curr=(low*low*low)+(high*high*high);
            if(curr==n){
                return true;
            } else if (curr<n) {
                low++;
            }else{
                high--;
            }
        }
      return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n= sc.nextLong();
        if(sumOfCubes(n)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }

    }
}
