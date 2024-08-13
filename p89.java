import java.util.Scanner;

public class p89 {

    // Function to reverse a portion of the array from index i to j
    static void Reverse(int[] arr, int i, int j){
        while(i < j){
            swap(arr, i, j); // Swap the elements at index i and j
            i++;
            j--;
        }
    }

    // Function to swap two elements in the array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Function to rotate the array in place by k steps
    static void rotateInplace(int[] arr, int k){
        int n = arr.length;

        // Normalize k in case k is greater than n
        k = k % n;

        // Reverse the first part of the array
        Reverse(arr, 0, n - k - 1);

        // Reverse the second part of the array
        Reverse(arr, n - k, n - 1);

        // Reverse the entire array
        Reverse(arr, 0, n - 1);
    }

    // Function to print the array
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input k value
        System.out.print("Enter k: ");
        int k = sc.nextInt();

        System.out.println("Original array:");
        printArray(arr);

        // Rotate the array in place
        rotateInplace(arr, k);

        System.out.println("Array after rotation:");
        printArray(arr);

        sc.close();
    }
}
