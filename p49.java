//Ques:- print 121212 in n no of rows and column
import java.util.Scanner;

public class p49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();  // Number of rows
        int c = sc.nextInt();  // Number of columns
        
        for (int i = 1; i <= r; i++) {  // Outer loop for rows
            for (int j = 1; j <= c; j++) {  // Inner loop for columns
                if ((i + j) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(2);
                }
            }
            System.out.println();  // Move to the next line after printing each row
        }
    }
}
