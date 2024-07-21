// import java.util.Scanner;

// public class p7Input {
//     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x= sc.nextInt();
//        int y= sc.nextInt();
//        int sum = x+y;
//        System.out.println(sum); 
//     }
// }




import java.util.Scanner;
public class p7Input{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your first Number:");
    int num1 = sc.nextInt();
    System.out.print("Enter Second Number:");
    int num2 = sc.nextInt();
    float total = num1 + num2;
    System.out.println(+total);
}
}