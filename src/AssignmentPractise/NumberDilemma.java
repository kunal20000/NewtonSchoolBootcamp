package AssignmentPractise;

import java.util.Scanner;

public class NumberDilemma {
    static int StringToInt(String S){
//Enter your code here
        return new Integer(S);
    }

    static String IntToString(int N){
//Enter your code here
        return Integer.toString(N);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n =sc.nextInt();
        StringToInt(s);
        IntToString(n);
    }
}
