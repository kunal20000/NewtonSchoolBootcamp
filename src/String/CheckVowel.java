package String;

import java.util.Scanner;

public class CheckVowel {
     public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        
         ch = Character.toLowerCase(ch);
         if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
             System.out.println("true");
         }else{
             System.out.println("false");
         }

        }
}
