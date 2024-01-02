package DSA_Sheet;

public class binarySearchRotatedArray {

    public static int binarySearchRotateArray(int[] arr, int target) {
       int low =0;
       int high = arr.length-1;
       
    }

    public static void main(String[] args) {

        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };

        int target = 0;
        int result = binarySearchRotateArray(arr, target);
        System.out.println(result);
    }
}
