package String;

import java.util.Scanner;

public class DivisibiltyTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int len=a.length()-1;

        if(a.charAt(len)== '0'){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}
