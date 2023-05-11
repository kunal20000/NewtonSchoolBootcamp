package AssignmentPractise;

import java.util.Scanner;

public class PokemonMaster {

    static int PokemonMaster(int A, int B){
//Enter your code here
        if(A>=B){
            return 1;

        }else{
            return 0;
        }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        PokemonMaster(a,b);
    }
}
