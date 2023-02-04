package MatrixProblem;

import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.util.Scanner;

public class MaximumMinimumArray {

    static int getMaximumFromArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
        static int getMinimumFromArray(int[] arr) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            return min;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr = new int[n];

            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int max= getMaximumFromArray(arr);
            int min= getMinimumFromArray(arr);
            System.out.println(max+" "+min);
    }
    }
}
