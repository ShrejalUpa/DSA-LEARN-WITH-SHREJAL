//Given 2 integers a and b swap the 2 given values using sum and different method.

public class p85 {
    static void swapWithoutTemp(int a , int b){
        System.out.println("Original value before swap");
        System.out.println("a: "+a);
        System.out.println("a: "+b);

        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Vslues after swap");
        System.out.println("a:"+a);
        System.out.println("a:"+b);
    }
    public static void main(String[] args) {
        int a = 9;
        int b = 3;
        int arr[] ={1,2,3,4,5};
        swapWithoutTemp(a, b);
    }
    
}
