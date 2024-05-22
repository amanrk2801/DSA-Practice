package Array;

import java.util.*;

public class DiagonalTraverse {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[] result = findDiagonalOrder(matrix);
        System.out.println("Diagonal Traverse: " + Arrays.toString(result));
    }

    public static int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int[] result = new int[m * n];
        int row = 0, col = 0;
        boolean upward = true;

        for (int i = 0; i < m * n; i++) {
            result[i] = matrix[row][col];

            if (upward) {
                // Move upward
                if (col == n - 1) {
                    row++;
                    upward = false;
                } else if (row == 0) {
                    col++;
                    upward = false;
                } else {
                    row--;
                    col++;
                }
            } else {
                // Move downward
                if (row == m - 1) {
                    col++;
                    upward = true;
                } else if (col == 0) {
                    row++;
                    upward = true;
                } else {
                    row++;
                    col--;
                }
            }
        }

        return result;
    }
}
