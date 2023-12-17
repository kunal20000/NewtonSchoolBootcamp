package AssignmentPractise;

import java.util.Scanner;

public class Knight {
    static int Knight(int X, int Y) {
        int count = 0;
        if (X + 1 <= 8 && Y - 2 >= 1) {
            count++;
        }
        if (X + 1 <= 8 && Y + 2 <= 8) {
            count++;
        }
        if (X - 1 >= 1 && Y - 2 >= 1) {
            count++;
        }
        if (X - 1 >= 1 && Y + 2 <= 8) {
            count++;
        }
        if (X - 2 >= 1 && Y - 1 >= 1) {
            count++;
        }
        if (X - 2 >= 1 && Y + 1 <= 8) {
            count++;
        }
        if (X + 2 <= 8 && Y - 1 >= 1) {
            count++;
        }
        if (X + 2 <= 8 && Y + 1 <= 8) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the X coordinate: ");
        int x = sc.nextInt();
        System.out.println("Enter the Y coordinate: ");
        int y = sc.nextInt();
        
        int moves = Knight(x, y);
        System.out.println("Number of possible moves: " + moves);

        sc.close();
    }
}