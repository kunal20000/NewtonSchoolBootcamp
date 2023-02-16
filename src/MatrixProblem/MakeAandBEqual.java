package MatrixProblem;

import java.util.Scanner;

public class MakeAandBEqual {

    static int getSteps(int[] a, int[] b){
        int CountOnesIna=0;
        int CountOnesInb=0;
        int op1=0;
        int op2=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                op1++;
            }
            CountOnesIna= CountOnesIna + a[i];
            CountOnesInb= CountOnesInb + b[i];

        }
        op2= 1+ Math.abs(CountOnesInb-CountOnesIna);
        return Math.min(op1,op2);

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        System.out.println(getSteps(a,b));
    }
}
