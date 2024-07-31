//Now lets practice that ques with more efficiently

import java.util.*;  // Importing the utility package which includes Scanner for taking input

// Defining a class named 'algebra' to perform algebraic operations
class algebra {
    // Method to add two integers
    int add(int a, int b) {
        int ans = a + b;  // Adding the two integers and storing the result in 'ans'
        return ans;       // Returning the result
    }
}

// Main class of the program
public class p57 {
    public static void main(String[] args) {
        algebra obj = new algebra();  // Creating an object of the 'algebra' class
        Scanner sc = new Scanner(System.in);  // Creating a Scanner object to take input from the user

        System.out.println("Enter two numbers: "); // Prompting the user to enter two numbers
        int x = sc.nextInt();  // Reading the first integer input
        int y = sc.nextInt();  // Reading the second integer input

        System.out.println("Sum of input numbers is: ");  // Displaying a message before the result
        int ans = obj.add(x, y);  // Calling the 'add' method of 'algebra' class to add the two numbers

        System.out.println(ans);  // Printing the result
    }
}

