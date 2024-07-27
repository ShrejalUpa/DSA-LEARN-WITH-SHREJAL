public class p41 {
    public static void main(String[] args) {
        int num = 1;
        while(num<=50){
            if(num%3==0){
                num++;
                continue;
            }
            System.out.println(num);
            num++;
        }
    }
}
