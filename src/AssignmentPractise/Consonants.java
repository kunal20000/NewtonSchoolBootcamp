package AssignmentPractise;

import java.util.Scanner;

public class Consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = "";
        s1= s.replaceAll("[aeiouAEIOU]","");
        System.out.println(s1);

        sc.close();
    }
}
