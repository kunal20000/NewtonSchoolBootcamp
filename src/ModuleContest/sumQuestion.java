package ModuleContest;

import java.util.Scanner;

public class sumQuestion {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        long sum = 0;
        for (int i = a; i <= b; i++)
        {
            for (int div = 1; div <= i; div--)
            {
                if (div % 2 == 0)
                {
                    sum += div;
                }
            }
        }
        System.out.println(sum);
    }
}
