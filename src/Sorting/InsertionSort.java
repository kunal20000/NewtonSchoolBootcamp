package Sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();

            int[] arr = new int[n];

            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            for(int i=0;i<n;i++){
                for(int j=1;j<n;j++){
                    if(arr[j-1]>arr[j]){
                        int temp = arr[j-1];
                        arr[j-1]=arr[j];
                        arr[j]=temp;
                    }
                }
            }

            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");

            }
            System.out.println();
        }
    }
}
