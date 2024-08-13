//Pattern: Two Pointers

//Sort an array consisting of only 0s and 1s
import java.util.Scanner;

public class p90 {

    // Function to print the array
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Function to swap elements at index i and j in the array
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Function to sort an array consisting of only 0s and 1s
    static void sortZeroesAndOnes(int[] arr) {
        int left = 0; // Pointer to the start of the array
        int right = arr.length - 1; // Pointer to the end of the array

        // Process the array until the two pointers meet
        while (left < right) {
            // Move the left pointer until we find a 1
            while (arr[left] == 0 && left < right) {
                left++;
            }
            // Move the right pointer until we find a 0
            while (arr[right] == 1 && left < right) {
                right--;
            }
            // Swap the found 1 on the left with the found 0 on the right
            if (left < right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements (only 0s and 1s):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Display original array
        System.out.println("Original Array:");
        printArray(arr);

        // Sort the array
        sortZeroesAndOnes(arr);

        // Display sorted array
        System.out.println("Sorted Array:");
        printArray(arr);

        sc.close();
    }
}
