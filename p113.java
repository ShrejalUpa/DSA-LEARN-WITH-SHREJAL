//Prefix-sum-array = it means create a array which represent that sum of all the index numbers from 0 to any selected number you have choosen
//like:- indexing  0 1 2 3 4 5
//        array    5 7 8 9 3 2

//find prefix sum 3
//prefix sum = 9 + 8 + 7 + 5 = 29


//implace :- it means same changes inside any array, it's logic is that we repeatedly add last element + first element
// from which we can generate prefix in running form
//sum[l, r] = a[l] - a[l-1]

//If any question arrise that (HOW TO FIND SUM OF A ONE D ARRAY WITHOUT TRAVESING) sO here we will use prefix logic


import java.util.Scanner;

public class p113 {
    static void findPrefxSumMatrix(int[][] matrix){

        int r = matrix.length;
        int c = matrix[0].length;

        // Traverse horizontally to calculate row-wise prefix sum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] += matrix[i][j - 1];  // Add previous column's value
            }
        }
    }

    static int findSum2(int[][] matrix, int l1, int c1, int l2, int c2) {
        int sum = 0;
        findPrefxSumMatrix(matrix);  // Calculate prefix sum first

        // Calculate sum of the rectangular submatrix
        for (int i = l1; i <= l2; i++) {  // For each row between l1 and l2
            if (c1 >= 1) {
                sum += matrix[i][c2] - matrix[i][c1 - 1];  // Exclude left part if c1 > 0
            } else {
                sum += matrix[i][c2];  // Directly add if starting from first column
            }
        }
        return sum;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns of matrix:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];

        System.out.println("Enter " + (r * c) + " values for the matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter rectangle boundaries l1, c1, l2, c2:");
        int l1 = sc.nextInt();
        int c1 = sc.nextInt();
        int l2 = sc.nextInt();
        int c2 = sc.nextInt();

        // Output the sum of the rectangle submatrix
        System.out.println("Rectangle Sum: " + findSum2(matrix, l1, c1, l2, c2));
    }
}
