
//Ques: Print the first multiple of 5 which is also a multiple of 7 

import java.util.*;
public class p39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(true){
            if((num%5==0) && (num%7==0)){
                System.out.println("Found Answer- "+num);
                break;
            }
            num++;
        }
    }
}
