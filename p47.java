
//Ques: Create Pyramid with stars
//method
//print (r-i) spaces
//print (2*i-1)

import java.util.Scanner;

public class p47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();  // Number of rows for the pyramid

        for (int i = 1; i <= r; i++) {  // Traversing over rows
            for (int j = 1; j <= (r - i); j++) {  // Print (r - i) spaces
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {  // Print (2 * i - 1) stars
                System.out.print("*");
            }

            System.out.println();  // Move to the next line after printing each row
        }
    }
}

