
//Given 2 integers a and b swap the 2 given values using temporary variables

public class p84 {
    static void swap (int a, int b){
        System.out.println("Original Values before swap");
        System.out.println("a: "+a);
        System.out.println("a: "+b);
        int temp =a;
        a=b;
        b=temp;
        System.out.println("Original Values after swap");
        System.out.println("a: "+a);
        System.out.println("a: "+b);
    }
    public static void main(String[] args) {
        p84 obj=new p84();
        obj.swap(2, 4);
    }
}
