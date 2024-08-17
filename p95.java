//Ques:- Given an integer array 'a' return the prefix sum/running sum inthe same array without creating a new array.
import java.util.*;

public class p95 {
    // Method to print the elements of an array
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Move to the next line after printing all elements
    }

    // Method to create a prefix sum array from the given array
    static int[] makePrefixSumArray(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i]; // Add the current element to the previous prefix sum
        }
        return arr;
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
}
