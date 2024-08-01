public class p61 {
    protected String str_1;

    public static void main(String[] args) {
        p61 obj = new p61();
        System.out.println("Outside package non child class" +obj.str_1);
        app2 obj2 = new app2();
        obj2.printFromChildClass();
        }
    }
    class app2 extends p61{
        void printFromChildClass(){
            app2 obj2 = new app2();
            System.out.println("child class: "+obj2.str_1);
        }
    }
