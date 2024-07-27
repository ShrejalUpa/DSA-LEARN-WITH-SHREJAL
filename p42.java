
//Ques:- Using Labels with Continue and Break Keyword


public class p42 {
    public static void main(String[] args) {
        myloop:for(int num = 1; num<=50; num++){
            if(num%3==0){
                continue myloop;
            }
            System.out.println(num);
        }
        outer:for(int i = 0; i<10;i++){
            inner:for(int j = 0; j<5; j++){
                break outer;
            }
        }
    }
}
