

//Block level Scope:- These are the variable that are declared inside the pair of brackets {}. A block of code may exist on its own meeans {  } putting nothing value in that. That also will be done or it can belong to any kind of loop.

public class p64 {
    void demo(){
        int a = 10;
        System.out.println(a);
        System.out.println(b);      //bcz this is a block level so you cant print it here...
        {
            int b = 10;
        }
    }
}
