//Number System: Number System is just a number to represent numbers in different forms with different base value.
//Decimal number system: 0 to 9 digits its base 10
//example: 3*10^3 + 4*10^2 + 5*10^1 + 1*10^0 = 3451

//Binary number System: 0 & 1 digits and its base is 2
//example: (1001) means convert it in binary form then it is like 3 2 1 0 
//          so (1*2^3) + (0*2^2) + (0*2^1) + (1*2^0)

//Conversion of Binary to decimal: 1101 = (1*2^3) + (1*2^2) + (0*2^1) + (1*2^0) so ans become 13

import java.util.Scanner;
public class p51 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int binary_num = sc.nextInt();
        int ans =0;      //converted decimal number
        int pw = 1;     //2^0=1 power of 2

        while(binary_num>0){
            int unit_digit = binary_num%10;
            ans +=(unit_digit * pw);
            binary_num /=10;
            pw *=2;
        }
        System.out.println(ans);
    }
}
