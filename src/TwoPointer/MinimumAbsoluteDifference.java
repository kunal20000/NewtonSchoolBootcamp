package TwoPointer;

import java.util.Scanner;

public class MinimumAbsoluteDifference {
    static int minimum_absolute_difference(int[] a, int[] b,int n){
        int maxDiff=Integer.MAX_VALUE;
       int i=0; int j=n-1;
       while(i!=n){
           int diff = Math.abs(a[i]-b[j]);
           maxDiff=Math.min(maxDiff,diff);
           j--;

           if(j<0){
               j=n-1;
               i++;
           }
       }
    return maxDiff;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] a= new int[n];
      int[] b = new int[n];
      for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
      }
      for(int j=0;j<n;j++){
          b[j]=sc.nextInt();
      }
      System.out.print(minimum_absolute_difference(a,b,n));

    }
}
