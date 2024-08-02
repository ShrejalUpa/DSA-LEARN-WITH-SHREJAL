


//Method level scope:-These are the variables that are declared inside the method and cannot be accessed outside the method. 

public class p63 {
    int a = 10;
    int b = 5;
    int add(){
        int p = 100;
        int q =20;
        return p+q;
    }
    int sub(){
        return p-q;
    }
}

//here p-q gives error bcs you initialize p and q inside the function.
