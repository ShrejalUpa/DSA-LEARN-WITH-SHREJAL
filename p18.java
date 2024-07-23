//Logical Operators:-

public class p18 {
    public static void main(String[] args){
        int s = 30   , q = 40 , t = 30;
        System.out.println((s>q)&&(t==s));
        System.out.println((s>q)!=(t<s));
        System.out.println((s>q)||(t<s));
        System.out.println((s>q)||(t==s));
        System.out.println(!(s>q));
    }
}