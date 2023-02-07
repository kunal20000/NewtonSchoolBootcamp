package Recursion;

public class Multiplication {

    /**
     *
     *  F(M,N) = M + M + M + M + M ..... N times
     *
     *  F(M,N) = M + F(M, N-1)
     *
     *  Base condition: N==0, return 0
     */
    static int Multiply(int n,int m){
        if(n==0){
            return 0;
        }else{
            return m + Multiply(m,n-1);
        }
    }



}
