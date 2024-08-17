//Pattern: prifix sums
//eg:- a = 2 1 3 4 5
// Its indexing number is 0 1 2 3 4
//SO what is the prefix sum of 4th index
//so like pref[0] = a[0]
//so like pref[1] = a[0]+a[1]
//so like pref[2] = a[0]+a[1]+a[2]
//so like pref[3] = a[0]+a[1]+a[2]+a[3]
//so like pref[4] = a[0]+a[1]+a[2]+a[3]+a[4]
//so the answer is 10

//Formula:- pref[i] = pref[i-1] + a[i]
import java.util.*;

public class p94 {
    // Function to create a prefix sum array from the given array
    static int[] makePrefixSumArray(int[] arr) {
        int n = arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0]; // Initialize the first element of the prefix array
        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] + arr[i]; // Add the current element to the previous prefix sum
        }
        return pref;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input array size
        System.out.println("Enter Array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Display the input array
        System.out.println("Input Array:");
        printArray(arr);

        // Create and display the prefix sum array
        int[] pref = makePrefixSumArray(arr);
        System.out.println("Prefix Sum Array:");
        printArray(pref);
    }

    // Function to print the elements of an array
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Move to the next line after printing all elements
    }
}
