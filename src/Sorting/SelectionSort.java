package Sorting;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort
{

   static void searchingSort(int[] arr)
    {
        int n = arr.length;
        for(int i=0;i<n-1;i++)
        {
            int min_idx = i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min_idx])
                {
                    min_idx = j;
                    // Swap the found minimum element with the first
                    // element
                    int temp = arr[min_idx];
                    arr[min_idx] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args)
    {
       SelectionSort ss = new SelectionSort();
       int[] arr = {20, 12, 10, 15, 2};
       ss.searchingSort(arr);

        System.out.println(ss);



    }

}
