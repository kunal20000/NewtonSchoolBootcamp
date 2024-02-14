package DSA_Sheet;

public class sortColors {
    public static void main(String[] args) {
        int[] arr = { 2, 0, 2, 1, 1, 0 };
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
