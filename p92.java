//Ques: given an array of integers 'a' move all the even integers at the begining of the array followed by all the odd integers. the relative order of odd or even integers does not matters.Rewturn any array that staisfies the condition.

//Solution: So when we are seeing odd at the left side and even at the right side or anything that does not match then we are using swap method.
import java.util.Scanner;
import java.util.InputMismatchException;

public class p92 {
    static void sortArrayByParity(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;

        while (left < right) {
            if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                swap(arr, left, right);
                left++;
                right--;
            } else {
                if (arr[left] % 2 == 0) {
                    left++;
                }
                if (arr[right] % 2 == 1) {
                    right--;
                }
            }
        }
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
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

        // Sort the array by parity
        sortArrayByParity(arr);

        // Display sorted array
        System.out.println("Sorted Array:");
        printArray(arr);

        sc.close();
    }

    private static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
