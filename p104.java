//Wite a program to display transpose of matrix entered by the user.

//transpose means row becomes column and column becomes row
//In this situation diagonal value will be the same.
//So  like original value look like thi-[(0,0), (0,1), (0,2), (1,0), (1,1), (1,2), (2,0), (2,1), (2,2)]
// And transpose value look like this-  [(0,0), (1,0), (2,0), (0,1), (1,1), (2,1), (0,2), (1,2), (2,2)]

//So here you get it right!
//lets do code...
import java.util.*;

public class p104 {
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] findTranspose(int[][] matrix, int r, int c) {
        int[][] transpose = new int[c][r]; // Transpose matrix with dimensions swapped (c x r)

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                transpose[j][i] = matrix[i][j]; // Swap row and column
            }
        }

        return transpose;
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

        System.out.println("Input Matrix");
        printMatrix(matrix);

        System.out.println("Transpose Of Matrix");
        int[][] ans = findTranspose(matrix, r, c);
        printMatrix(ans);
    }
}
