//Check if we can partition the array into two subarrays with equal sum more formally, check thet the prefix sum of a part of the array is equal to the suffix sum of rest of the array.
import java.util.*;

public class p97 {
    
    // Function to calculate the sum of all elements in the array
    static int findArraySum(int[] arr) {
        int totalsum = 0;
        // Traverse the array and accumulate the sum
        for (int i = 0; i < arr.length; i++) {
            totalsum += arr[i];
        }
        return totalsum;
    }
    
    // Function to check if the array can be partitioned into two parts with equal sum
    static boolean equalSumPartition(int[] arr) {
        // Get the total sum of the array elements
        int totalsum = findArraySum(arr);
        int prefsum = 0;
        
        // Traverse the array to find if there's a point where prefix sum equals suffix sum
        for (int i = 0; i < arr.length; i++) {
            // Add current element to prefix sum
            prefsum += arr[i];
            
            // Calculate the suffix sum (remaining part after the current element)
            int suffixSum = totalsum - prefsum;
            
            // Check if prefix sum equals suffix sum
            if (suffixSum == prefsum) {
                return true; // If equal, partition is possible
            }
        }
        return false; // If no equal partition is found, return false
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input array size
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        
        // Initialize array with given size
        int[] arr = new int[n];
        
        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Check if equal partition is possible and print the result
        System.out.println("Equal Partition possible: " + equalSumPartition(arr));
        
        sc.close();
    }
}
