//Now do the transpose matrix without craeting any other Array

//So here we can use swap method instead of creating any other array

import java.util.Scanner;

public class p105 {
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void transposeInplace(int[][] matrix, int r, int c) {
        if (r != c) {
            System.out.println("In-place transpose is only possible for square matrices (r == c).");
            return;
        }

        for (int i = 0; i < r; i++) {
            for (int j = i + 1; j < c; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of rows and columns of matrix: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        int totalElement = r * c;
        System.out.println("Enter " + totalElement + " values");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Input Matrix:");
        printMatrix(matrix);

        if (r == c) {
            System.out.println("In-place Transpose Of Matrix:");
            transposeInplace(matrix, r, c);
            printMatrix(matrix);
        } else {
            System.out.println("Transpose is not possible in-place for non-square matrices.");
        }
    }
}
