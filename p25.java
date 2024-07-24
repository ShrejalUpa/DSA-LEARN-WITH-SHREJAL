//Ques:- Write a program to print the value if it is divisible by 3 or 5

import java.util.*;
public class p25 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%3==0 && num%5==0){
            System.out.println("Found Ans- "+num);
        }else{
            System.out.println("You have enterd wrong value");
        }
    }
}
