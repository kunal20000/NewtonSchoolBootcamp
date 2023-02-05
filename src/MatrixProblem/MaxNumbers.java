package MatrixProblem;

import java.util.Scanner;

public class MaxNumbers {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            if (t % 5 == 0) {
                System.gc();
            }
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int max = arr[0];
            int sec_max = Integer.MIN_VALUE;
            int third_max = Integer.MIN_VALUE;

            for (int i = 1; i < n; i++) {
                if (arr[i] > max) {
                    third_max = sec_max;
                    sec_max = max;
                    max = arr[i];

                } else if (arr[i] > sec_max) {
                    third_max = sec_max;
                    sec_max = arr[i];
                } else if (arr[i] > third_max) {
                    third_max = arr[i];
                }
            }
            System.out.println(max + " " + sec_max + " " + third_max);
        }

    }

}
