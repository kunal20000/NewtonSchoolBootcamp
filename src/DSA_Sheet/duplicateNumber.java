package DSA_Sheet;

public class duplicateNumber {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 2, 2 };

        int n = arr.length - 1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println(arr[i]);
            }
        }

    }
}
