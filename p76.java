//Example

public class p76 {
    void multiArrays(){
        int[][] arr = {{3,4,5},{54,76,43}};
        for(int i=0; i<2;i++){
            for(int j=0;j<3;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
    public static void main(String[] args) {
        p76 obj = new p76();
        obj.multiArrays();
    }
}
