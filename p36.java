

//Note:   For finding two gaps we can use num == 2 , num = num - 2on the place of num--


import java.util.*;
public class p36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        do{
            System.out.println(num);
            num++;
        }while(num <= 10);
    }
}
