package DSA_Sheet;

public class searchInsertPosition {

    // Given a sorted array of distinct integers and a target value, return the
    // index if
    // the target is found. If not, return the index where it would be if it were
    // inserted
    // in order.
    // You must write an algorithm with O(log n) runtime complexity.
    // Example 1:
    // Input: nums = [1,3,4,2,2]
    // Output: 2

    static int findInsertPostition(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 2, 2 };
      
        int target = 2;

        int res = findInsertPostition(arr, target);
        System.out.println(res);
    }
}
