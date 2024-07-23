
//Ques- What is the output of the following code if input is : hellow world 21
// Scanner sc = new Scanner(System.in);
// String p = sc.next();
//int q  = sc.nextInt();
// System.out.print(p+ " " +q);

import java.util.*;
public class p15 {
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String p = sc.next();
        int q  = sc.nextInt();
        System.out.print(p+ " " +q);
   } 
}



// Guess the output first.....





//InputMismatchException because At the place of 'world' that is string and nextInt method finding the integer value just next to the 'hello' that's why it give this type of error 