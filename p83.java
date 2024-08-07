
//Giv(en an array 'a' consisting of integers returns the first value that is repeating in this array. if no values is being repeated return -1
import java.util.*;

public class p83 {

    static int firstRepeatingNumber(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] == arr[j]){
                    return arr[i];  // Return the first repeating number
                }
            }
        }
        return -1;  // Return -1 if no repeating number is found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        int result = firstRepeatingNumber(arr);
        if (result != -1) {
            System.out.println("First repeating number: " + result);
        } else {
            System.out.println("No repeating number found.");
        }
    }
}
