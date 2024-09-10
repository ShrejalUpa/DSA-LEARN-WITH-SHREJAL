//Spiral matrix
//Ques:- Given an nxm matrix 'a' return all elements of the matrix in spiral order

public class p109 {

    // Function to print the matrix (for debugging purposes)
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Function to print the matrix elements in spiral order
    static void printSpiralOrder(int[][] matrix, int r, int c) {
        int topRow = 0, bottomRow = r - 1;
        int leftCol = 0, rightCol = c - 1;
        int totalElements = 0;

        while (totalElements < r * c) {
            // Traverse from left to right on the top row
            for (int j = leftCol; j <= rightCol && totalElements < r * c; j++) {
                System.out.print(matrix[topRow][j] + " ");
                totalElements++;
            }
            topRow++;

            // Traverse from top to bottom on the right column
            for (int i = topRow; i <= bottomRow && totalElements < r * c; i++) {
                System.out.print(matrix[i][rightCol] + " ");
                totalElements++;
            }
            rightCol--;

            // Traverse from right to left on the bottom row
            for (int j = rightCol; j >= leftCol && totalElements < r * c; j--) {
                System.out.print(matrix[bottomRow][j] + " ");
                totalElements++;
            }
            bottomRow--;

            // Traverse from bottom to top on the left column
            for (int i = bottomRow; i >= topRow && totalElements < r * c; i--) {
                System.out.print(matrix[i][leftCol] + " ");
                totalElements++;
            }
            leftCol++;
        }
    }

    public static void main(String[] args) {
        // Define a sample 3x4 matrix
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        // Get dimensions of the matrix
        int r = matrix.length;    // Number of rows
        int c = matrix[0].length; // Number of columns

        // Print the matrix (optional, for debugging)
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Print the matrix in spiral order
        System.out.println("Spiral Order:");
        printSpiralOrder(matrix, r, c);
    }
}
