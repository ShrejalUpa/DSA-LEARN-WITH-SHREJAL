
//WIll the following code generate any error?

public class p68 {
    public static void temp(int p) {
        int q = p;
        q = q-100;
    }
    public static void main(String[] args) {
        int p = 890;
        temp(p);
        System.out.println(q);
    }
}




//Here it gives error because method and maiin is another method thats why it will give the error on sout(q)