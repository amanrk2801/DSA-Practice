package Array;

import java.util.*;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = generateSpiralMatrix(3, 3);
        System.out.println("Spiral Matrix:");
        printMatrix(matrix);
    }

    public static int[][] generateSpiralMatrix(int m, int n) {
        int[][] matrix = new int[m][n];
        int top = 0, bottom = m - 1, left = 0, right = n - 1;
        int num = 1;

        while (top <= bottom && left <= right) {
            // Traverse top row
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;

            // Traverse right column
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;

            // Traverse bottom row (if applicable)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = num++;
                }
                bottom--;
            }

            // Traverse left column (if applicable)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num++;
                }
                left++;
            }
        }

        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}

