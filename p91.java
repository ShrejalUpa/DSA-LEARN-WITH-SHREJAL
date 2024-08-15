// //From previous code here we use swap


import java.util.Scanner;

public class p91 {
    static void sortZeroesAndOnes(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;

        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;
            } else {
                if (arr[left] == 0) {
                    left++;
                }
                if (arr[right] == 1) {
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

    private static void printArray(int[] arr) {
        // Implemented method to print the array elements
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}





















































// import java.util.Scanner;

// public class p91 {
//     static void sortZeroesAndOnes(int[] arr) {
//         int n = arr.length;
//         int left = 0, right = n - 1;

//         while (left < right) {
//             // Mistake: '=' should be '==', as '=' is assignment, and '==' is comparison.
//             if (arr[left] == 1 && arr[right] == 0) {
//                 // The swap method should actually swap the values, not throw an exception.
//                 swap(arr, left, right);
//                 left++;
//                 right--;
//             } else {
//                 // Corrected: Moved the checks to the else part so that if the swap didn't happen,
//                 // we can still adjust the pointers based on the values at left and right.
//                 if (arr[left] == 0) {
//                     left++;
//                 }
//                 if (arr[right] == 1) {
//                     right--;
//                 }
//             }
//         }
//     }

//     private static void swap(int[] arr, int left, int right) {
//         // Corrected: Implemented the swap method to actually swap the elements.
//         int temp = arr[left];
//         arr[left] = arr[right];
//         arr[right] = temp;
//     }


//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Input array size
//         System.out.println("Enter array size:");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         // Input array elements
//         System.out.println("Enter " + n + " elements (only 0s and 1s):");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         // Display original array
//         System.out.println("Original Array:");
//         printArray(arr);

//         // Sort the array
//         sortZeroesAndOnes(arr);

//         // Display sorted array
//         System.out.println("Sorted Array:");
//         printArray(arr);

//         sc.close();
//     }

//     private static void printArray(int[] arr) {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'printArray'");
//     }
// }
