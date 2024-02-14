package DSA_Sheet;

import java.util.HashSet;
import java.util.Set;

public class setMatrixZeros {

    // iven an m x n integer matrix matrix, if an element is 0, set its entire row
    // and
    // column to 0's.
    // You must do it in place.
    // Example 1:
    // Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
    // Output: [[1,0,1],[0,0,0],[1,0,1]]

    public static void setZeros(int[][] matrix){
       int rows = matrix.length; /// numbers of rows
       int cols = matrix[0].length; //represent the first row of matrix

       // use two sets to store the zero marked rows and columns
       Set<Integer> zeroRows = new HashSet<>();
       set<Integer> zeroCols = new HashSet<>();

       // find the rows and cols containing zeros
       for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
          if(matrix[i][j]==0){
            zeroRows.add(i);
            zeroCols.add(j);
          }
        }
       }

       //set entire rows with zero
        for(int row: zeroRows){
            for(int j=0;j<cols;j++){
                matrix[i][j]=0;
            }
        }

        // set entire cols with zero
        for(int col: zeroCols){
            for(int i=0;i<rows;i++){
                matrix[i][col]=0;
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1,1,1},
            {1,0,1},
            {1,1,1}
        };
       setZeros(matrix);
       // Print the modified matrix

       for(int i=0;i<matrix.length;i++){
          for(int j=0;j<matrix[0].length;j++){
            System.out.print(matrix[i][j]+" ");
          }
          System.out.println();
       }

    }
}
