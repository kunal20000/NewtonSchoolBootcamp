package MatrixProblem;

import java.util.Scanner;

public class ArrSortedRotatedClockwise {

    static boolean isRotatedIncrementOrder(int[] arr){
        int incrementCount=0;
        for(int s=1;s<arr.length;s++){
            if(arr[s]<arr[s-1]){
                incrementCount++;
            }
        }
        return incrementCount==1;
    }

    static boolean isRotatedDecrementOrder(int[] arr) {
        int decrementCount=0;
        for (int k = 1; k < arr.length; k++) {
            if (arr[k] > arr[k - 1]) {
                decrementCount++;
            }
        }
        return decrementCount==1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            if(arr[0]>arr[n-1] && isRotatedIncrementOrder(arr)){
                System.out.println("Yes");
            }else if(arr[0]<arr[n-1] && isRotatedDecrementOrder(arr)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }
    }
}
