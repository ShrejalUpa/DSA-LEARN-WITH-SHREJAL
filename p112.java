//Prefix sums in 2D Array:- Given a matrix 'a' of dimension n*m and 2 coordinates(l1, r1) and (l2, r2), Return the sum of the rectangle from (l1, r1) to (l2, r2)
//(i)   l1 >= l1   >   r2 >= r2
//(ii)  0 <= l1   ,   l2 < n
//(iii) 0 <= r1   ,   r2 < m

//While we solve the problem then we will write at the place of n=r and m=c

import java.util.Scanner;
public class p112 {
    static int findSum(int[][] matrix, int l1, int r1, int l2, int r2){
        int sum = 0;
        for(int i = l1; i <= l2; i++){
            for(int j = r1; j <= r2; j++){
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns of matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];
        int totalElements = r * c;

        System.out.println("Enter " + totalElements + " values for the matrix:");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter rectangle boundaries l1, r1, l2, r2");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        // Validating boundaries
        if (l1 < 0 || l1 >= r || r1 < 0 || r1 >= c || l2 < 0 || l2 >= r || r2 < 0 || r2 >= c || l1 > l2 || r1 > r2) {
            System.out.println("Invalid boundaries, please make sure they are within the matrix range and correctly ordered.");
        } else {
            System.out.println("Rectangle Sum: " + findSum(matrix, l1, r1, l2, r2));
        }

        sc.close();
    }
}
