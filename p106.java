//Given a square matrix, turn it by 90 degree in a clockwise direction without using any extra space
//So here 90 degree means we have to rotate our box at one time that turns in to 90 degree
// So lets do code..

import java.util.*;

public class p106 {
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " "); // Print with space
            }
            System.out.println();
        }
    }

    static void transposeInplace(int[][] matrix, int r, int c) {
        for (int i = 0; i < r; i++) { // r should be the number of rows
            for (int j = i + 1; j < c; j++) { // Start j from i+1 to avoid redundant swaps
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    static void reverseArray(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i]; // Swap the values
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void rotate(int[][] matrix, int n) {
        // Step 1: Transpose the matrix
        transposeInplace(matrix, n, n);
        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            reverseArray(matrix[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get matrix dimensions
        System.out.println("Enter the size of the square matrix (n x n): ");
        int n = sc.nextInt();

        // Initialize matrix
        int[][] matrix = new int[n][n];

        // Input matrix elements
        System.out.println("Enter " + (n * n) + " elements for the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Rotate the matrix
        rotate(matrix, n);

        System.out.println("Rotated Matrix:");
        printMatrix(matrix);
    }
}
