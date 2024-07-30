//parity= n%2
// example   2  | 9
//           2  | 4    rem -1
//           2  | 2    rem -0
//              | 1    rem -0
//    So here answer starts from bottom to top also take last rem 1 answer is 1 0 0 1 Understand!!!


import java.util.*;
public class p52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal_num = sc.nextInt();
        int ans = 0;  // binary number
        int pw = 1;   // power of 10

        while(decimal_num>0){
            int parity = decimal_num % 2;
            ans += parity * pw;
            pw *= 10;
            decimal_num /=2;
        }
        System.out.println(ans);
    }
}
