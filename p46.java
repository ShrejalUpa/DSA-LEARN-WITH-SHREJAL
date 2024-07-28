
//Ques: Trangular

import java.util.Scanner;

public class p46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= (r+1-i); j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
