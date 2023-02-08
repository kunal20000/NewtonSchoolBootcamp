package ModuleContest;

import java.util.Scanner;

public class IncreasingDigit {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(numOfStones(n));
    }

    public static int numOfStones(int n){
        int count =0;
        int i=1;
        while(i<=n){
            int num=i;
            int digit=num%10;
            num=num/10;
            while(num>0){
                int curr=num%10;
                if(curr>=digit)
                    break;
                digit=curr;
                num=num/10;
            }
            if(num==0)
                count++;
            i++;
        }
        return count;



    }
}
