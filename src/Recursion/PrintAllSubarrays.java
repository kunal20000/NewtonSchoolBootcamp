package Recursion;

public class PrintAllSubarrays {
//    static void printSubArrays(int[] arr,int n){
//        for(int i=0;i<arr.length;i++){
//            for(int j=i;j<arr.length;j++){
//                printSubArrays(arr,i,j);
//                System.out.println();
//            }
//        }
//    }
//
//    static void printSubArrays(int[] arr,int start,  int end){
//        for(int i=start;i<=end;i++){
//            System.out.println(arr[i]+" ");
//        }
//    }
static void PrintSubarrays(int Arr[], int N){
    for(int i=0; i< Arr.length; i++){
        for(int j=i; j< Arr.length; j++){
            printSubarray(Arr, i, j);
            System.out.println();
        }
    }
}

    // Function to print a subarray
    static void printSubarray(int[] arr, int start, int end){
        for(int i= start; i<=end; i++){
            System.out.print(arr[i]+" ");
        }
    }

}
