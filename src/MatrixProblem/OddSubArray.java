package MatrixProblem;

import java.util.Scanner;

public class OddSubArray {

    static long oddSubarrays(int[] arr) {
        long count = 0;
        int i = 0;
        while (i < arr.length) {
            int j = i;
            while (j < arr.length && j % 2 == 1) {
                j++;
            }
            int oddCount = j - i;
            count += getSubarrays(oddCount);
            i = j + 1;
        }
            return count;
    }
        static long getSubarrays(long n){

        return n*(n+1)/2;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int [] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
        }
            System.out.println(oddSubarrays(arr));
    }
}
