
//Reverese an array cosisting of integer value.
public class p86 {
    static int[] reverseArray(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int j =0; 
        //Traverse original array in reverse direction
        for(int i=n-1; i>=0; i--){
            ans[j++]=arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int a =9;
        int b = 3;
        int[] arr = {1,2,3,4,5};
        int[] ans = reverseArray(arr);
        for(int i =0; i< ans.length; i++){
            System.out.print(ans[i] +" ");
        }
    }
}
