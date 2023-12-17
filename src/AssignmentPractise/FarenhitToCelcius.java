package AssignmentPractise;

import java.util.Scanner;

public class FarenhitToCelcius {
    static void farhrenheitToCelsius(int farhrenheit)
    {
        // Your code here
        int Tempcel = (farhrenheit-32)*5/9;
        System.out.println(Tempcel);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int F = sc.nextInt();
        farhrenheitToCelsius(F);
        sc.close();
    }
}
