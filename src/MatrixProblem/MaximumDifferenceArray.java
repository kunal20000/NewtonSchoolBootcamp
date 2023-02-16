package MatrixProblem;

import java.util.Scanner;

public class MaximumDifferenceArray {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];

      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
      int[]leftMin = new int[n];
      leftMin[0] = arr[0];
      for(int i=1;i<n;i++){
          leftMin[i]= Math.min(arr[i],leftMin[i-1]);
      }

      int[] rightMax = new int[n];
      rightMax[n-1]= arr[n-1];
      for(int i=n-2;i>=0;i--){
          rightMax[i]= Math.max(arr[i],rightMax[n-1]);
      }
      int i=0,j=0,maxDiff=-1;
      while(i<n && j<n){
          if(leftMin[i]<rightMax[i]){
              maxDiff= Math.max(maxDiff,j-i);
              j=j+1;
          }else{
              i=i+1;
          }
      }
      System.out.println(maxDiff);
    }

}
