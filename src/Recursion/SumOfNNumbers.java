package Recursion;

public class SumOfNNumbers {

    //recursive steps
    /**
     * Write a recursive function to compute the sum of n numbers.
     *
     * Input: int n
     * Output: 1+2+3+4+5+.....+ n (int)
     *
     * Sum of n numbers f(n) = n+n-1+n-2+n-3+ ....+ 3+ 2+1
     *
     * Sum of n-1 numbers f(n-1) = n-1+ n-2+ n-3+ n-4+ .... + 3+2+1
     *
     *  f(n) = n + f(n-1)  , n == 0, answer = 0
     *
     *  if (n==0) ans = 0
     *  else ans = n+ f(n-1)
     *
     *  Order of function calls for n = 5
     *
     *  first call= 5+ f(4)
     *  second call = 4 + f(3)
     *  third call = 3 + f(2)
     *  fourth call = 2 + f(1)
     *  fifth call = 1+ f(0)
     *  sixth call = f(0) = 0
     */
    static  int recursiveSum(int n){
     if(n==0){
         return 0;
     }else{
         return n+recursiveSum(n-1);
     }
    }

    public static void main(String[] args) {

        System.out.println(recursiveSum(5));
    }
}
