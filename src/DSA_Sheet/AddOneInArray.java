package DSA_Sheet;

import LinkedList.linkedList;

public class AddOneInArray {

    public static int[] addOneArray(int[] arr) {
        int n = arr.length;
        int carry = 1; // start with carry one

        for (int i = n - 1; i >= 0; i--) {

            int sum = arr[i] + carry;
            arr[i] = sum % 10; // update the current element with reaminder
            carry = sum / 10; // update the carry for next iteration
        }

        // if the carry after the loop, create a new array with extra digit
        if (carry > 0) {
            int[] resultArray = new int[n + 1];
            resultArray[0] = carry;
            System.arraycopy(arr, 0, resultArray, 1, n);
            return resultArray;

        } else {
            return arr;
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 9 };

        // add one 1 to the array considering carry over
        int[] newArray = addOneArray(arr);

        System.out.println(java.util.Arrays.toString(newArray));

    }
}
