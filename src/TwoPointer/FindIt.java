package TwoPointer;

import java.util.Scanner;

public class FindIt {
    static long binarySearch(long k){
        long low=1;
        long high=Integer.MAX_VALUE;
        while(low<=high){
            long mid=(low+high)/2;
            long x = (mid*mid)+(3*mid);
            if(x==k){
                return mid;
            } else if (x<k) {
                low=mid+1;
            }else {
                high=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        System.out.print(binarySearch(k));

    }
}
