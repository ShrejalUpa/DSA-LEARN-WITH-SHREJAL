

//Ques:- 10 to 1 print reverse form

import java.util.*;
public class p35 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the value: ");
      int n = sc.nextInt();
      for(int num = n; num >= 1; num--){
        System.out.println("The Reverse Number Of Your Value Is :-"+num);
      }
      
      
    }
}
