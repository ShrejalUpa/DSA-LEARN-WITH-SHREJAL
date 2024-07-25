
//Ques:- Print the sum o fthe n Natural numbers where n is the input using for loop

import java.util.*;
public class p33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int num = 1; num <= n; num++){
            sum = sum + num;
        }
        System.out.println(sum);
    }
}
