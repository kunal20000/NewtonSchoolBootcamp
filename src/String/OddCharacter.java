package String;

import java.util.Scanner;

public class OddCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for(int i=0;i<s.length();i++){
            if(i%2==0){
                System.out.print(s.charAt(i)+" ");
            }
        }
    }
}