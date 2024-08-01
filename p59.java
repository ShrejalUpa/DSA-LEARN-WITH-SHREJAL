//Package:- collection of similer classes , subpackages and interfaces 
//Constructon:-It is a special method which is used to initialize objects.Constructor name = class name ,And constructors having no any return type.
//for e.g.:- algebra(){
//          sout("Consturctor of algebra classes called")}




class p59 {
    int a; // Instance variable 'a'
    int b; // Instance variable 'b'
    
    // Constructor for initializing the instance variables 'a' and 'b'
    p59(int x, int y){
        System.out.println("Constructor of Algebra class called");
        a = x;
        b = y;
    }
    
    // Method to add the values of 'a' and 'b'
    int add(){
        int ans = a + b; // Calculate sum
        return ans; // Return the result
    }
    
    // Method to subtract the value of 'b' from 'a'
    int sub(){
        return a - b; // Return the result of the subtraction
    }
    
    // Method to multiply the values of 'a' and 'b'
    int mul(){
        return a * b; // Return the result of the multiplication
    }
    
    public static void main(String[] args) {
        p59 obj = new p59(5, 7); // Create an object of class 'p59' with 'a=5' and 'b=7'
        int ans = obj.add(); // Call the 'add()' method of 'obj'
        System.out.println(ans); // Print the result of 'add()'
        System.out.println(obj.sub()); // Call and print the result of 'sub()' method of 'obj'
        System.out.println(obj.mul()); // Call and print the result of 'mul()' method of 'obj'
        
        p59 obj2 = new p59(10, 7); // Create another object of class 'p59' with 'a=10' and 'b=7'
        System.out.println(obj2.add()); // Call and print the result of 'add()' method of 'obj2'
        System.out.println(obj2.sub()); // Call and print the result of 'sub()' method of 'obj2'
        System.out.println(obj2.mul()); // Call and print the result of 'mul()' method of 'obj2'
    }
}
