package Array;

import java.util.*;

public class SortMatrixDiagonally {
    public static void main(String[] args) {
        int[][] mat = {
                {3, 3, 1, 1},
                {2, 2, 1, 2},
                {1, 1, 1, 2}
        };

        int[][] sortedMat = diagonalSort(mat);

        System.out.println("Original Matrix:");
        printMatrix(mat);
        System.out.println("\nSorted Matrix Diagonally:");
        printMatrix(sortedMat);
    }

    public static int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        // Sort diagonals starting from the top row
        for (int i = 0; i < m; i++) {
            sortDiagonal(mat, i, 0);
        }

        // Sort diagonals starting from the left column
        for (int j = 1; j < n; j++) {
            sortDiagonal(mat, 0, j);
        }

        return mat;
    }

    private static void sortDiagonal(int[][] mat, int i, int j) {
        int m = mat.length;
        int n = mat[0].length;

        List<Integer> diagonal = new ArrayList<>();

        // Collect elements from the diagonal
        while (i < m && j < n) {
            diagonal.add(mat[i][j]);
            i++;
            j++;
        }

        // Sort the diagonal
        Collections.sort(diagonal);

        // Fill the diagonal with sorted elements
        while (i > 0 && j > 0) {
            i--;
            j--;
            mat[i][j] = diagonal.remove(diagonal.size() - 1);
        }
    }

    public static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            System.out.println(Arrays.toString(row));
        }
    }
}
