//Question- take two numbers in integers input A and B : a>b and find the remainders when a is divided by b.

//Ans:-Formula=  Diviser*Quotient+Remainder=Dividend 
// So i have to find remainder= Divident-Division*Quotient 


import java.util.Scanner;
public class p8Exercise {
    public static void main(String[] args) {
        System.out.println("Please Enter dividend:-");
        Scanner sc= new Scanner(System.in);
        int A= sc.nextInt();


        System.out.println("Please Enter divisor:-");
        int B = sc.nextInt();

        int Q = A/B ;
        int r = A-(B*Q);
        System.out.println("The Remainder when "+A+" is divided by "+B+" is "+r);

        
    }
}
