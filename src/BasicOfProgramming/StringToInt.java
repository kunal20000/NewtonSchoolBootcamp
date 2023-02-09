package BasicOfProgramming;

import java.util.Scanner;

public class StringToInt {
    static int StringToInt(String S){
      return new Integer(S);
    }
    static String intToString(int n){
        return Integer.toString(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //System.out.println(StringToInt(n));
        System.out.println(intToString(n));
    }
}
