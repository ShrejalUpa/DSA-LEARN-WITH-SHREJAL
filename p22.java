//Conditions

/* if (condition){

}


if else:-

if(condition){

}
else{

}


if-else-if:-

if(condition){

}
else if(condition2){

}
else{

}

*/
import java.util.*;
public class p22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name with your Age  Brother ❤️:-");
        String s = sc.next();
        int p = sc.nextInt();

        if( p >= 18){
            System.out.println("You Are Eligible Bro😀 to drive your dream car!!");
        }else if(p<18){
            System.out.println("Sorry!!🥲 Little bro " +s+ " you are so small you cant drive!!:(");
        }else{
            System.out.println("PLease Enter Properlly Brother❤️👍");
        }
    }
}




//Hope you learn somthing new.....:)