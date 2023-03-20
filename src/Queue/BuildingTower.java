package Queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BuildingTower {

    static void solve(int[] arr){
        int reqDisk = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++)
        {
            pq.add(arr[i]);

            while (!pq.isEmpty() && reqDisk == pq.peek()) {
                System.out.print(pq.poll() + "  ");
                reqDisk--;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        solve(arr);
    }
}
