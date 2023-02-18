package TwoPointer;

import java.util.Scanner;

public class MaxComplement {
//    max. complement
//            easy
//    Time Limit: 2 sec
//    Memory Limit: 128000 kB
//    Problem Statement
//    You have given an array A of even length. Print the maximum possible product of any number and their complement.
//    The first element is the complement of the last element, the second element is the complement of the second last, and so on.
//    Solve the given problem in O(n).
//    Input
//    First line contain a integer N.
//    Next line contain N space integer A[i].
//
//    Constraints
//1<=N<=10^5
//            1<=A[i]<=10^9
//    Output
//    Print the maximum possible product.
//            Example
//    Sample Input 1:
//            8
//            1 3 4 2 3 4 8 6
//
//    Sample Output 1:
//            24
//
//    Sample Input 2:
//            6
//            1 2 3 4 5 6
//
//    Sample Output 2:
//            12


    static long findMaxProduct(int[] arr,int n){
        int i=0;
        int j=n-1;
        long max=-1000000000;
        while(i<j){
            long result=arr[i]*arr[n-1-i];
            if(max<result){
               max=result;
            }
            i++;
            j--;
        }
        return max;

    }
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
       for (int i = 0; i < n; i++) {
           arr[i]=sc.nextInt();
       }
     System.out.print(findMaxProduct(arr,n));
    }
}
