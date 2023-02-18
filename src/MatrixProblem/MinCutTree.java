package MatrixProblem;

import java.util.Scanner;

public class MinCutTree {


      static int getMaximumFromArray(int[] arr){
          int max=arr[0];
          for(int i=0;i<arr.length;i++){
              max=Math.max(max,arr[i]);
          }
          return max;
      }
      static long getCollectedWood(int[] arr,int k){
          long collectedWood=0;
          for(int i=0;i<arr.length;i++){
              collectedWood=collectedWood+Math.max(0,arr[i]-k);
          }

         return collectedWood;
      }
      static int binarySearch(int[] arr,int k){
          int left=1;
         int  right=getMaximumFromArray(arr);
          while(left<=right){
              int mid=(left+right)/2;
              long collectedWood=getCollectedWood(arr, mid);
              if(collectedWood<=k){
                  right=mid-1;
              }else{
                  left=mid+1;
              }
          }
          return left;
      }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int k = sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(binarySearch(arr, k));
    }

}
