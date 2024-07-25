//Ques:- If a user enter 2 then the course will be selected as per the Course like that you have to create one programm.

import java.util.*;
public class p31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option =  sc.nextInt();
        // So here we can use switch case...

        switch(option){
            case 1:
                System.out.println("BCA");
                break;
            case 2 : 
                System.out.println("BSc.IT");
                break;
            case 3:
                System.out.println("BSc.CS");
                break;
            case 4:
                System.out.println("BSc.DS");
                break;
            default:
                System.out.println("This Course is not available!");
        }
    }
}
