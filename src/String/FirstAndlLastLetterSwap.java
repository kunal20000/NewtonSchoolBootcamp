package String;

import java.util.Scanner;

public class FirstAndlLastLetterSwap {

    public static String swapFirstandLast(String s){
        if(s.length()<2){
            return s;
        }

        // convert the string into array

        char [] ch = s.toCharArray();
        char temp = ch[0];

        // swap

        ch[0] = ch[ch.length-1];
        ch[ch.length-1] = temp;
        return String.valueOf(ch);
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       
       System.out.println(swapFirstandLast(s));  
    
   // time com = O(N)
   // space com= O(N)

    }
}
