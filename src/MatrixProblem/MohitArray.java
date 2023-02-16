package MatrixProblem;

import java.util.Scanner;

public class MohitArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];


        int sumOfAll = (n*(n+1))/2;
        int sumOfArray=0;
        for(int i=0;i<n-1;i++){
          sumOfArray+=arr[i];

        }


        int missingNumber = sumOfAll-sumOfArray;
        System.out.println(missingNumber);



    }
}
