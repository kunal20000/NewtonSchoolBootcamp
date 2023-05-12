package AssignmentPractise;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch1 = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);
        if(ch1=='R'||ch2=='R'){
            System.out.println('R');
        }else if(ch1=='J'){
            System.out.println(ch2);
        }else if(ch2=='J'){
            System.out.println(ch1);
        }else{
            System.out.println('D');
        }
    }
}
