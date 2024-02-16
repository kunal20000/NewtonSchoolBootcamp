package DSA_Sheet;

public class singleElememntInSortedArray {

    // You are given a sorted array consisting of only integers where every element
    // appears exactly twice, except for one element which appears exactly once.
    // Return the single element that appears only once.
    // Your solution must run in O(log n) time and O(1) space.
    // Example 1:
    // Input: nums = [1,1,2,3,3,4,4,8,8]
    // Output: 2

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };

        // for (int i = 0; i < arr.length - 1; i+=2) {
        // if (arr[i] != arr[i + 1]) {
        // System.out.print(arr[i]);
        // break;
        // }
        // }

        int left = 0;
        int high = arr.length - 1;
        while (left < high) {
            int mid = left + (high - left) / 2;

            if (mid % 2 == 1) {
                mid--;
            }

            if (arr[mid] == arr[mid + 1]) {
                left = mid + 2;
            } else {
                high = mid;
            }
        }
        System.out.println(arr[left]);
    }
}
