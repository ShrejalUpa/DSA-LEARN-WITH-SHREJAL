//What is the output of below code?

public class p66 {
    public static void decrease(int n1 , int n2) {
        n1--;
        n2 =n2-2;
        System.out.println(n1+":"+n2);      //n1 and n2 are formal parameter
    }
    public static void main(String[] args) {
        int p = 26;
        int q = 13;
        decrease(p, q);
        System.out.println(p+":"+q);        // p and q are actual parameter    
    }
}




//here that is pass by value method so value will naver chage here

// n1=p=26
// n2=q=13
// so, 
//     n--
//         =25
//         n2=n2-2
//             =11

// so ans= 25:11
