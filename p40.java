
//Ques: Print all the value between 1 and 50 except for the multiple of 3


public class p40 {
    public static void main(String[] args) {

        for (int num = 1; num<=50 ; num++){
            if(num%3==0){
            continue;
            }
        System.out.println(num);
        }
    }
}
