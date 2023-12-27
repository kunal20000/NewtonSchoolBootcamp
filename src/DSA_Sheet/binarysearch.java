package DSA_Sheet;

import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // int[] arr = new int[n];
        // int target = sc.nextInt();

        // for (int i = 0; i < n; i++) {
        //     arr[i] = sc.nextInt();
        // }

        int [] arr = {-3,5,9,12,14,16,18,20};
        int target = -3;
        int result = binarySearchIndex(arr, target);
        System.out.println(result);
        // sc.close();
    }

    static int binarySearchIndex(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

}
