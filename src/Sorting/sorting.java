package Sorting;

import java.awt.*;
import java.util.Scanner;


// arr={1,2,3,4,5,6, 7}
// target element 6

public class sorting {

    static int binarySearch(int[] arr, int target){
        int low=0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target){
                return mid;
            } else if (arr[mid]<target) {
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int target = 40;


        int value = binarySearch(arr,target);
        System.out.println(value);

    }
}
