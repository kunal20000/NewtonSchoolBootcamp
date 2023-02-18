package TwoPointer;

import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOfArrays {
    static boolean intersectionOfArrays(int[] arr,int k){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==k){
                return true;
            } else if (arr[mid]<k) {
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
       return false;


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int m =sc.nextInt();
        int[] b = new int[m];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();

        }
        for(int j=0;j<m;j++){
            b[j]=sc.nextInt();
        }
        Arrays.sort(b);
        for(int i=0;i<m;i++){
            if(intersectionOfArrays(a,b[i])){
                System.out.print(b[i]+" ");
            }
        }

    }
}
