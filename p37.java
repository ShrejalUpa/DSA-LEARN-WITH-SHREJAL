


//Ques:  Print the sum of the stream of integers inthe input

//Solution:- Stram of the integer in the input means it is not fix where you have to stop your execution
// Note:  if you have to work n times then use forloop or there is given list of Array etc
//Note:   if i do not have any idea how much time we have to work then we will use whileloop


import java.util.*;
public class p37 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int sum = 0;
    while(num != -1){
        sum +=  num;
        num = sc.nextInt();
    }
    System.out.println(sum);
}    
}
