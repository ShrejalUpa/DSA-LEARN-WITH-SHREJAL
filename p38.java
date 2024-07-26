

//Ques:  For-    do while loop


import java.util.*;
public class p38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        do{
            sum+=sum;
            num=sc.nextInt();
        }while(num!=-1);
    }
}
