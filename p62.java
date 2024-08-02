

//Scope of variable in java:- Scope means where a variable can be accesed remainder in same scope any two variable cannot be same. In different scope any two variable can be same.
//eg.- int a = 10;
//      int a = 20;   here you can not use again a


//there are three level of scope of variable 1) class level scope 2) method level scope 3) block level of scope

//1) Class level scope:-

public class p62 {
    int a = 10;  // Member variable; these can be accessed anywhere in your code.
    int b = 5;

    int add() {
        return a + b;
    }

    int sub() {
        return a - b;
    }

    public static void main(String[] args) {
        p62 obj = new p62();
        System.out.println("Addition: " + obj.add());
        System.out.println("Subtraction: " + obj.sub());
    }
}
