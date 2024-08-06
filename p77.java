
//Calculate the sum of all the elements in the given array.
// input: arr[] = {1,3,4}

public class p77 {
    void sumOfArray(){
        int[] arr={1,3,4};
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    } 
    public class Main{  
        public static void main(String[] args) {
            p77 obj = new p77();
            obj.sumOfArray();
        } 
    }
}
