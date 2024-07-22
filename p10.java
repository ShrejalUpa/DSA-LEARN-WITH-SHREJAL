// Take two integers input, A and B , A>B and find the remainder when A is devided by B.
//Divisor * Quotient + Remainder = Divident
// So Remainder = Divident - Divisor * Quotient


import java.util.*;
public class p10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input A:");
        int A = sc.nextInt();   //Divident
        System.out.print("Enter input B:");
        int B = sc.nextInt();   // Divisor
        int Q = A/B;
        int R = A -( B * Q );
        System.out.print("When " +A+ " is Devident by " +B+ " Then the remainder is: " +R);
    }
}