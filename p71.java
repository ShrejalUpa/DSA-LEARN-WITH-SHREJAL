
//Accessing element in single dimensional Array:-
//int[] ages = new int[2];

public class p71 {
    void demoArray(){
        int[] ages = new int[3];
        float[] ages2 = new float[4];
        String[] ages3 = new String[4];

        ages[0] = 34;
        ages2[1] = 12;
        ages3[2] = "Shrejal";

        System.out.println(ages[0]);
        System.out.println(ages2[1]);
        System.out.println(ages3[2]);

    }
    public static void main(String[] args) {
        p71 obj = new p71();
        obj.demoArray();
    }
}
