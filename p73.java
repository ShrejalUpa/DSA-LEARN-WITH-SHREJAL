public class p73 {
    void demoArray(){
        // Define and initialize a two-dimensional array
        int[][] arr = {{54, 67, 86}, {23, 54, 11}, {3, 2, 4}};

        // Print elements of the two-dimensional array
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);

        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);

        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
        System.out.println(arr[2][2]);
    }

    public static void main(String[] args) {
        p73 obj = new p73(); // Correct class instantiation
        obj.demoArray();
    }
}
