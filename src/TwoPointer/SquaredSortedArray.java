package TwoPointer;

import java.util.Arrays;
import java.util.Scanner;

public class SquaredSortedArray {
    public static int[] squaredSortedArray(int[] arr){
        int n=arr.length;
        int[] output=new int[n];
        for(int i=0;i<n;i++){
            output[i]=arr[i]*arr[i];
        }
        Arrays.sort(output);
        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n =sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int[] output=squaredSortedArray(arr);
            for(int i=0;i<output.length;i++){
                System.out.print(output[i]+"  ");
            }
            System.out.println();
        }

    }
}
