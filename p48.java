//Ques: numerical rectangular pattern


import java.util.Scanner;

public class p48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();  // Number of rows (and columns) for the rectangular pattern

        for(int i = 1; i <= r; i++) {  // Outer loop for rows
            for(int j = 1; j <= r; j++) {  // Inner loop for columns
                System.out.print(j + " ");  // Print numbers from 1 to r on the same line
            }
            System.out.println();  // Move to the next line after printing each row
        }
    }
}
