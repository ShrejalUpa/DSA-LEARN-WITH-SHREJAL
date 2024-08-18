//Given an array of integers of size n. Answer q quries where you need to print the sum of values in a given range of indices from 1 to r(both included).
//Note:- The values of 1 and r in Queries followed 1-based indexing.
//lets see, l=1 & r =3
// sum l to r = pref[r]-pref[l-1]
// for 3 to 5
// pref[5]-pref[2]


import java.util.Scanner;

public class p96 {
    // Function to create a prefix sum array
    static int[] makePrefixSumArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for array size
        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        // Array initialization
        int[] arr = new int[n+1];  // Fixed array initialization
        
        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        // Create the prefix sum array
        int[] prefsum = makePrefixSumArray(arr);

        // Input for number of queries
        System.out.println("Enter number of queries:");
        int q = sc.nextInt();

        // Handle each query
        while (q-- > 0) {
            System.out.println("Enter Range (l r):");
            int l = sc.nextInt();
            int r = sc.nextInt();

            // Calculate the sum for the range [l, r]
            int ans = prefsum[r] - prefsum[l - 1];
            System.out.println("Sum: " + ans);
        }
        
        sc.close();
    }
}
