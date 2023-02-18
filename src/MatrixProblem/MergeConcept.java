package MatrixProblem;

import java.util.Scanner;

public class MergeConcept {
    public static void divide(int[] arr,int starIndex,int endIndex){
        //divide steps
        int mid = starIndex+(endIndex-starIndex)/2; //timeComplexity issue not come
        if(starIndex>=endIndex){  //statIndex is greater than endIndex and is startIndex is same as endIndex & sigle element reamining and array end
            return;
        }
         divide(arr,starIndex,mid);                 //startIndex-endIndex/2 you can use
        divide(arr,mid+1,endIndex);
        conquer(arr,starIndex,mid,endIndex);
    }

    private static void conquer(int[] arr, int starIndex, int mid, int endIndex) {
        //conquer steps;
        int merger[] = new int[endIndex-starIndex+1]; //ending index is always endIndex-1 that's why you have correct that's why +1;

        int arr1= starIndex; //start index
        int arr2= mid+1; //second array
        int mergeArray=0; //merge array

        while(arr1<= mid && arr2<=endIndex){
            if(arr[arr1]<=arr[arr2]){
                merger[mergeArray++]=arr[arr1++];
            }else{
                merger[mergeArray++]=arr[arr2++];
            }
        }
        while(arr1<=mid){
            merger[mergeArray++]=arr[arr1++];
        }
        while(arr2<=endIndex){
            merger[mergeArray++]=arr[arr2++];
        }
        for(int i=0, j=starIndex; i<merger.length;i++,j++){
            arr[j]= merger[i];
        }
    }

    public static void main(String[] args) {
        //int arr[] ={6,3,9,5,2,8};
       // int n = arr.length;
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] arr1= new int[n];
       int m = sc.nextInt();
       int[] arr2= new int[m];
       for(int i=0;i<n;i++){
           arr1[i]=sc.nextInt();
       }
       for(int i=0;i<m;i++){
           arr2[i]=sc.nextInt();
       }
      //  divide(,0,n-1);
        //print
        int[] merger=new int[n];
        for(int i=0;i<merger.length;i++){
            System.out.print(merger[i]+" ");
        }
        System.out.println();
    }

}
