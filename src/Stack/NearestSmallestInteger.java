package Stack;

import java.util.Scanner;
import java.util.Stack;

public class NearestSmallestInteger {


    static void printSmallestNearestInteger(int[] arr){
        Stack<Integer> st = new Stack<>();

        for(int i:arr){
            while(!st.isEmpty() && st.peek()>i){
                st.pop();
            }
            if(st.isEmpty()){
                System.out.print(-1+" ");
            }else{
                System.out.print(st.peek()+" ");
            }
            st.push(i);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        printSmallestNearestInteger(arr);
    }
}
