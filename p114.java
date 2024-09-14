//Ques: Using prefix sum over both rows & cols.

//Matrix:-

//  l1 l2 l3 l4 l5 l6 l7
//  r1- 1 2 3 4 5 6 7
//  r2- 2 4 6 8 10 12 14
//  r3- 3 6 9 12 15 18 21
//  r4- 4 8 12 16 20 24 28
//  r5- 5 10 15 20 25 30 35
//  r6- 6 12 18 24 30 36 42
//  r6- 7 14 21 28 35 42 49

//find (l3, r2) till (l5, r4)

//Solution  common partwhich we subtract at two times so trix is that we will subract it twice and add it once.

// so we can use the formula     a[i][j] = sum of rectangle((0,0),(i,j))
//  sum = a[l2][r2]
//  ans = sum-up-left+upleft
//  sum = a[l2][r2]
//  up = a[l1-1][r2]
//  left = a[l2][r1-1]
//  leftup = a[l1-1][r1-1]

// remember l1 r1 should greter than 0


import java.util.Scanner;

public class p114 {

    // Calculate row-wise and column-wise sum
    static void findPrefixSumMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        // Traverse horizontally to calculate row-wise prefix sum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }

        // Traverse vertically to calculate column-wise prefix sum
        for (int j = 0; j < c; j++) {
            for (int i = 1; i < r; i++) {
                matrix[i][j] += matrix[i - 1][j];
            }
        }
    }

    // Calculate sum of submatrix from (l1, r1) to (l2, r2)
    static int findSum3(int[][] matrix, int l1, int r1, int l2, int r2) {
        int ans = 0, sum = 0, up = 0, left = 0, leftup = 0;

        // Call the function to calculate row and column-wise prefix sum
        findPrefixSumMatrix(matrix);

        // Calculate submatrix sum
        sum = matrix[l2][r2];

        if (r1 > 0) {
            left = matrix[l2][r1 - 1];
        }
        if (l1 > 0) {
            up = matrix[l1 - 1][r2];
        }
        if (l1 > 0 && r1 > 0) {
            leftup = matrix[l1 - 1][r1 - 1];
        }

        ans = sum - up - left + leftup;  // Apply inclusion-exclusion principle
        return ans;
    }

    // Main method to handle user input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input for matrix size
        System.out.println("Enter number of rows and columns of the matrix:");
        int r = sc.nextInt();
        int c = sc.nextInt();

        // Initialize matrix
        int[][] matrix = new int[r][c];

        // User input for matrix elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // User input for rectangle boundaries
        System.out.println("Enter rectangle boundaries (l1, r1, l2, r2):");
        int l1 = sc.nextInt();  // Start row
        int r1 = sc.nextInt();  // Start column
        int l2 = sc.nextInt();  // End row
        int r2 = sc.nextInt();  // End column

        // Calculate and print the sum of the submatrix
        int result = findSum3(matrix, l1, r1, l2, r2);
        System.out.println("Submatrix sum: " + result);
    }
}
