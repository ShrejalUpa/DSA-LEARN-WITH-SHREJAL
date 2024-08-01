public class p60 {
    // Public instance variable
    public String str_1 = "I am a public member.";
    
    // Method to print the value of 'str_1' from within the class
    void printFromClass(){
        System.out.println("Within class: " + str_1);
    }
    
    public static void main(String[] args) {
        p60 obj = new p60(); // Create an instance of 'p60'
        obj.printFromClass(); // Call the method to print 'str_1' from within the class
        System.out.println("Within class: " + obj.str_1); // Directly print the value of 'str_1'
        
        p60 obj2 = new p60(); // Create another instance of 'p60'
        obj2.printFromClass(); // Call the method to print 'str_1' from within the class
    }
    
    // Inner class 'App2'
    class App2 {
        // Private instance variable within 'App2'
        private String str_1;

        // Method to print the value of 'str_1' from within the inner class
        void printFromOutsideclass() {
            App2 obj = new App2(); // Create an instance of 'App2'
            System.out.println("Within package outside class: " + obj.str_1); // Print the value of 'str_1' from 'App2'
        }
    }
}
