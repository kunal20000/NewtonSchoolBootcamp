package MatrixProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ifNMultiply2NExist {
    static int binarySearch(int[] arr,int el){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==el){
                return mid;
            }else if(arr[mid]<el){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
    static boolean checkIfPairExist(int[] arr){

        Arrays.sort(arr);
        for(int j=0;j<arr.length;j++){
            int ai=2*arr[j];
            if(binarySearch(arr,ai)!=-1){
             return true;
            }
        }return false;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int  i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

            if(checkIfPairExist(arr)){
                System.out.print("Yes");
            }else{
                System.out.print("No");
            }

    }
}
