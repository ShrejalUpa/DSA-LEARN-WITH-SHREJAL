
//Ques:- Java program to add two numbers using methods.

import java.util.*;
public class p56 {
    static void sum(){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int total = num1 + num2;
        System.out.println(total);
    }
    public static void main(String[] args) {
        sum();
    }
}












//static variable/methods:- Any method if you write static behind methods than that is called as static variable. it is a single copy for whole class. And this is independent object
// example- ststic int b;
//instatnce variable:- A normal variable is called as instance variable.In this all objects make there own copy.
//example- int a;

