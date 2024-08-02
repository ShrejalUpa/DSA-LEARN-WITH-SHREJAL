

//Pass by value and pass by referance pvr it is callled function creates its own copies..
public class p65 {
    // Static method to add two numbers
    static int sum(int a, int b) {
        return a + b;  // Performing the addition of a and b
    }

    static int x = 20;
    static int y = 10;

    public static void main(String[] args) {
        // Calling the static method sum using the class name and printing the result
        int result = p65.sum(x, y);
        System.out.println("Sum: " + result);  // Printing the sum of x and y
    }
}



//formal parameters = (in a, int b)
//actual parameter = sum(a,b)  or sum(5,8)