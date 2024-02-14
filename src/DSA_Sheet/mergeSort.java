package DSA_Sheet;

public class mergeSort {

    static void divide(int[] arr, int l, int r) {
        if (l >= r) {
         return;
        }

        int m = l + (r - l) / 2;

        divide(arr, l, m);
        divide(arr, m + 1, r);
        merge(arr, l, m, r);

    }

    static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[m + 1 + j];
        }

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }

    }

    public static void main(String[] args) {
        int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int n = arr.length;

        divide(arr,0,n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
