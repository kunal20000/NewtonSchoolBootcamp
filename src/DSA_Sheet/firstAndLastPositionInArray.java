package DSA_Sheet;

public class firstAndLastPositionInArray {

    static int firstAndLastIndex(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        int res = firstAndLastIndex(arr, target);
        System.out.println(res);
    }
}
