//Package:- collection of similer classes , subpackages and interfaces 
//Constructon:-It is a special method which is used to initialize objects.Constructor name = class name ,And constructors having no any return type.
//for e.g.:- algebra(){
//          sout("Consturctor of algebra classes called")}




class p59 {
    int a;
    int b;
    p59(int x, int y){
        System.out.println("Constructor of Algebra class called");
        a=x;
        b=y;
    }
    int add(){
        int ans=a+b;
        return ans;
    }
    int sum(){
        return a-b;
    }
    int mul(){
        return a*b;
    }
    public static void main(String[] args) {
        p59 obj = new p59(5,7);
        int ans = obj.add();
        System.out.println(ans);
        System.out.println(obj.sum());
        System.out.println(obj.mul());
        p59 obj2 = new p59(10,7);
        System.out.println(obj2.add());
        System.out.println(obj2.sum());
        System.out.println(obj2.mul());
    }
}
