
//Ques: Numerical Triangular Pattern
import java.util.Scanner;

public class p50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();  // Number of rows
        
        for (int i = 1; i <= r; i++) {  // Outer loop for rows
            for (int j = 1; j <= i; j++) {  // Inner loop for columns
                System.out.print(j);  // Print numbers from 1 to i in each row
            }
            System.out.println();  // Move to the next line after printing each row
        }
    }
}
