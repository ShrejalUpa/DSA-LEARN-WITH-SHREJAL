public class p72 {
    void demoArray(){
        int ages[] = new int[5];
        float f[] = new float[3];
        String s[] = {"Saumya", "Shivam","Shrejal"};

        ages[0] = 45;
        ages[1] = 76;
        ages[2] = 43;
        ages[4] = 12; // No change needed here

        f[0] = 23.5f;
        f[1] = 21.0f;
        f[2] = 98.0f;

        s[2] = "Shrejal";
        // s[4] = "Shatrunjay"; // This is out of bounds and should be removed
        s[1] = "Manju";

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        // System.out.println(ages[3]); // ages[3] is uninitialized, so commenting out

        System.out.println(f[0]);
        System.out.println(f[1]);
        System.out.println(f[2]);

        System.out.println(s[1]);
        System.out.println(s[2]);
        // System.out.println(s[4]); // This is out of bounds and should be removed
    }

    public static void main(String[] args) {
        p72 obj = new p72();
        obj.demoArray();
    }
}
