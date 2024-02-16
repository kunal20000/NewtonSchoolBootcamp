class quickSort {
    public static void main(String[] args) {
       int[] arr = {10,9,8,7,6,5,4,3,2,1};
       int n = arr.length;
       quick(arr,0,n-1);
       for(int i=0;i<n;i++){
           System.out.print(arr[i]+" ");
       }
    }
    static void quick(int[] arr, int low, int high){
        if(low<high){
            int pi = quicksort(arr,low,high);
            quick(arr,low,pi-1);
            quick(arr,pi+1,high);
        }
    }
    
    static int quicksort(int[] arr, int low, int high){
        // choosing the pivot
        int pivot = arr[high];
        // index of smaller element the right position of pivot so for
        int i = (low-1);
        for(int j=low;j<=high-1;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return (i+1);
        // return the index where pivot has been placed
        
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]= temp;
    }
}