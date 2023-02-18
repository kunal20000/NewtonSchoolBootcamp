package TwoPointer;

import java.util.Scanner;

public class MaxSubarraySizeK {

    static int max_sum_subaaray(int[] arr, int n, int k){
        int max_sum=0;

        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum>max_sum){
                    max_sum=sum;
                }

            }
        }
        return max_sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int k= sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int maxSum= max_sum_subaaray(arr,n,k);
        System.out.println(maxSum);
    }
}
