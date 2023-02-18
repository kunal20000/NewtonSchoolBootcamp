package TwoPointer;

import java.util.Scanner;

public class KSum {
    static int find_min_divisor(int[] arr, int  n , int limit){
        int low=1;
        int high=1000000;
        while(low<high){
            int mid=(low+high)/2;
            int sum=0;
            for(int i=0;i<n;i++){
                sum+= Math.ceil((double)arr[i]/
                                 (double)mid);
            }if(sum<mid){
                return mid;
            }else{
               low= mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int k =sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(find_min_divisor(arr,n,k));

    }
}
