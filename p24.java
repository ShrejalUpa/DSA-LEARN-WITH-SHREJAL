//Ques:- Write a program to print the value if it is even and divisiable by 3

import java.util.*;
public class p24 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0 && num%3==0){
            System.out.println("Found answer- " +num);
        }else{
            System.out.println("You have enter Wrong Value");
        }
    }
}
