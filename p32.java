//Ques: - Print The sum of the "N" Natural numbers. Where N is The INPUT.


import java.util.*;
public class p32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num = 1;
        int sum = 0;
        while(num <= N){
            sum = sum + num;
            num++;
        }
        System.out.println(sum);

    }
}
