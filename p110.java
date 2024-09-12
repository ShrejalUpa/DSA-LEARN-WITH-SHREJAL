//Given a positive integer n, generate an n*n matrix filled with element from 1 to n^2 in spriral order
//solution: It means when i take the value of n so n's value should be come in square format 
//Example n = 5
//So i have elements in that matrix 25 values


public class p110 {

    // Function to print the matrix (for debugging purposes)
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Function to generate the spiral matrix
    static int[][] generateSpiralMatrix(int n) {
        int[][] matrix = new int[n][n];
        int topRow = 0, bottomRow = n - 1, leftCol = 0, rightCol = n - 1;
        int curr = 1;
        
        while (curr <= n * n) {

            // Top row: leftCol to rightCol
            for (int j = leftCol; j <= rightCol && curr <= n * n; j++) {
                matrix[topRow][j] = curr++;
            }
            topRow++;

            // Right column: topRow to bottomRow
            for (int i = topRow; i <= bottomRow && curr <= n * n; i++) {
                matrix[i][rightCol] = curr++;
            }
            rightCol--;

            // Bottom row: rightCol to leftCol
            for (int j = rightCol; j >= leftCol && curr <= n * n; j--) {
                matrix[bottomRow][j] = curr++;
            }
            bottomRow--;

            // Left column: bottomRow to topRow
            for (int i = bottomRow; i >= topRow && curr <= n * n; i--) {
                matrix[i][leftCol] = curr++;
            }
            leftCol++;
        }

        return matrix;
    }

    public static void main(String[] args) {
        int n = 5; // Change n as required
        int[][] matrix = generateSpiralMatrix(n);

        // Print the matrix
        System.out.println("Spiral Matrix:");
        printMatrix(matrix);
    }
}
