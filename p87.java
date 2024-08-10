//Inplace:- It do not create any new array which you have given, do changes on that perticular array. that is called as In Place reverse.
public class p87 {

    // Method to swap elements in an array
    static void swapInArray(int[] arr, int i, int j) {
        int temp = arr[i];  // Store the value at index i in a temporary variable
        arr[i] = arr[j];    // Assign the value at index j to index i
        arr[j] = temp;      // Assign the stored value in temp to index j
    }

    // Method to reverse the array in place
    static void reverseArray(int[] arr) {
        int i = 0;                // Start from the beginning of the array
        int j = arr.length - 1;   // Start from the end of the array

        while (i < j) {           // Continue until the two pointers meet in the middle
            swapInArray(arr, i, j);  // Swap the elements at the two pointers
            i++;                    // Move the start pointer to the right
            j--;                    // Move the end pointer to the left
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};  // Example array

        reverseArray(arr);  // Call method to reverse the array

        // Print the reversed array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
