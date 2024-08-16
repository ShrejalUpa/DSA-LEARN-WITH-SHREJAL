//Given an integer array 'a' sorted in non decreasing order, return an array of the squares of each number sorted in non decreasing order.
import java.util.InputMismatchException;
import java.util.Scanner;

public class p93 {
    static int[] sorSquares(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;
        int[] ans = new int[n];
        int k = n - 1; // Start from the end of the result array

        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k--] = arr[left] * arr[left];
                left++;
            } else {
                ans[k--] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        // Input array size with validation
        while (true) {
            try {
                System.out.println("Enter array size:");
                n = sc.nextInt();
                break; // Exit loop if input is valid
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid integer for array size.");
                sc.next(); // Clear the invalid input
            }
        }

        int[] arr = new int[n];

        // Input array elements with validation
        for (int i = 0; i < n; i++) {
            while (true) {
                try {
                    System.out.println("Enter element " + (i + 1) + ":");
                    arr[i] = sc.nextInt();
                    break; // Exit loop if input is valid
                } catch (InputMismatchException e) {
                    System.out.println("Please enter a valid integer.");
                    sc.next(); // Clear the invalid input
                }
            }
        }

        // Display original array
        System.out.println("Original Array:");
        printArray(arr);

        // Get sorted squares array
        int[] ans = sorSquares(arr);

        // Display sorted squares array
        System.out.println("Sorted Squares Array:");
        printArray(ans);

        sc.close();
    }

    private static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
