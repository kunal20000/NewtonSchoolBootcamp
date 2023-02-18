package TwoPointer;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class TargetDifference {
    static boolean targetDifferenceExist(int[] arr, int targetDifference){
        for(int i=1;i<arr.length;i++){
            int b=arr[i];
            int a=b-targetDifference;
         if(binarySearch(arr,0,i-1,a)!=-1){
             return true;
         }
        }
        return false;
    }

    static int binarySearch(int[] arr,  int low, int high, int el){
        low=0;
        high=arr.length-1;
        while(low<=high){
            int mid =(low+high)/2;
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();

        }
        int targetDifference=sc.nextInt();
        if(targetDifferenceExist(arr,targetDifference)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}
